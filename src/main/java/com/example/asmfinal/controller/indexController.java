package com.example.asmfinal.controller;


import com.example.asmfinal.entity.*;
import com.example.asmfinal.service.*;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/WatchStore")
public class indexController {
    @Autowired
    CartService cartService;
    @Autowired
    OrderService  orderService;
    @Autowired
    OderDetailService oderDetailService;
    @Autowired
    MailService mailService;
    @Autowired
    UserService userService;
    @Autowired
    BrandService brandService;
    @Autowired
    CateGoryService cateGoryService;
    @Autowired
    ProductImageService productImageService;
    @Autowired
    ProductService productService;
    @Autowired
    Product_DetailService productDetailService;
    @Autowired
    SessionService sessionService;
    User userdisplay=null;
    @GetMapping("/login")
    String getLogin(@ModelAttribute("user") User user,Model model) {

        return "views/login";
    }

    //Shared
    @ModelAttribute("listUser")
    List<User> listUser(){
        return userService.getListUser();
    }
    @PostMapping("/login")
    String getLoginByPost(@ModelAttribute("user") User user,Model model) {
        for (User user1:listUser()
             ) {
            if (user.getEmail().equals(user1.getEmail())){
                if(user.getUser_password().equals(user1.getUser_password())){
                    System.out.println(user1.getActive());
                    if (user1.getActive()==false){
                        return "views/admin/adminoverview";
                    }else {
                        sessionService.setAttribute("userLogin",user.getEmail());

                        sessionService.setAttribute("idLogin",user1.getUser_id()+"");
                        System.out.println(sessionService.getAttibute("idLogin")+"Heloooo");
                        return "views/user/index";
                    }

                }else {

                }
            }
        }
        model.addAttribute("createUserDisplay","Account or Password invalid");
        return "views/login";
    }


    //USER
    @ModelAttribute("listProduct")
    List<Products> listProduct() {
        return productService.listProduct();
    }

    @ModelAttribute("listProductMen")
    List<Products> listProductMen() {
        return productService.listProductMen("Nam");
    }

    @ModelAttribute("listProductWoMen")
    List<Products> listProductWoMen() {
        return productService.listProductMen("Nu");
    }
    @ModelAttribute("listDetail")
    List<ProductDetail> listProductDetail(){
        return productDetailService.listProductDetail();
    }
    @GetMapping("/home")
    private String index() {
//        System.out.println(cartService.findOne(7).getProduct_cart_id());
//        sessionService.removeAttribute("userLogin");
        sessionService.setAttribute("listCartSession",cartService.listCart());
        sessionService.setAttribute("listSize",cartService.listCart().size()+"");
        sessionService.setAttribute("toTalSession",cartService.totalPrice()+"");
        return "views/user/index";
    }
    @GetMapping("/about")
    String getAbout() {

        return "views/user/about";
    }

    @GetMapping("/blog")
    String getBlog() {
        return "views/user/blog";
    }

    //    @GetMapping("/blog-detail")
//    String getBlogDetail(){
//        return "views/user/blog-detail";
//    }


    @GetMapping("/contact")
    String getContact() {
        return "views/user/contact";
    }

    @GetMapping("/product-detail")
    String getProductDetail(@RequestParam Integer product_id,Model model) {
        Optional<Products> products=productService.findById(product_id);
        Optional<ProductDetail> productDetail=productDetailService.PRODUCT_DETAIL_ONE(product_id);
        model.addAttribute("productById",products);
        model.addAttribute("productDetailById",productDetail);
        System.out.println(product_id);
        return "views/user/product-detail";
    }
    @GetMapping("/addcart")
    String addCart(){

        return "views/user/product-detail";
    }
    @ModelAttribute("total")
    Double total(){
        return cartService.totalPrice();
    }

    @GetMapping("/product")
    String getProduct() {
        return "views/user/product";
    }
    @GetMapping("/shopping-cart")
    String getshoppingcat(Model model){
        model.addAttribute("listCart",cartService.listCart());
        sessionService.setAttribute("listCartSession",cartService.listCart());
        model.addAttribute("total",cartService.totalPrice());
        return "views/user/shoping-cart";
    }
    @GetMapping("/delete")
    String deleteShoppingcart(@RequestParam Integer delete_id,Model model){
        cartService.deleteByid(delete_id);
        model.addAttribute("listCart",cartService.listCart());
        model.addAttribute("total",cartService.totalPrice());
        sessionService.setAttribute("listSize",cartService.listCart().size()+"");
        sessionService.setAttribute("listCartSession",cartService.listCart());
        sessionService.setAttribute("toTalSession",cartService.totalPrice()+"");
        return "views/user/shoping-cart";
    }
//    @PostMapping("/update")
//    String updateCart(@RequestParam Integer qty,@RequestParam Integer idupdate,Model model){
//
//
////        model.addAttribute("listCart",cartService.listCart());
////        model.addAttribute("total",cartService.totalPrice());
////        sessionService.setAttribute("listSize",cartService.listCart().size()+"");
////        sessionService.setAttribute("listCartSession",cartService.listCart());
//
////        sessionService.setAttribute("toTalSession",cartService.totalPrice()+"");
//        return "views/user/shoping-cart";
//    }
    @PostMapping("/order")
    String order(@RequestParam String address,@RequestParam String phonenumber,Model model){
      Order order=new Order();
      order.setOrder_address(address);
      order.setOrder_date(new Date());
      order.setPhone_number(phonenumber);
      order.setStatus("Đã Đặt Hàng");
        String id=sessionService.getAttibute("idLogin");
        User user=userService.findById(Integer.parseInt(id));
        order.setUser(user);
        orderService.save(order);
      List<Cart> listCart= cartService.listCart();
        for (Cart cart: listCart
             ) {

            OrderDetail orderDetail=new OrderDetail();
            orderDetail.setPrice(cart.getPrice());
            orderDetail.setQuantity(cart.getQuantity());
            orderDetail.setSubtotal(cart.getTotal());
            orderDetail.setOrder(order);
            Products products=productService.findByIdOne(cart.getProduct_id_temp());
            orderDetail.setProducts(products);
            oderDetailService.save(orderDetail);
        }
        cartService.deleteAll();
        return "views/user/success";
    }
    @PostMapping("/shopping-cart")
    String postShoppingCart(@RequestParam Integer product_id_cart,@RequestParam Integer quantity,Model model) {
        Products products=productService.findByIdOne(product_id_cart);
        if (cartService.findOne(product_id_cart)==null){
            Cart cart=new Cart();
            cart.setProduct_id_temp(product_id_cart);
            cart.setProduct_name(products.getProduct_name());
            cart.setProduct_img(products.getList().get(0).getImage_url());
            cart.setQuantity(quantity);
            cart.setPrice(products.getPrice());
            cart.setTotal(products.getPrice()*quantity);
            cartService.save(cart);
        }else {
            Cart cart=cartService.findOne(product_id_cart);
            cart.setQuantity(cartService.findOne(product_id_cart).getQuantity()+quantity);
            cart.setTotal(products.getPrice()*quantity);
            cartService.save(cart);
        }
        model.addAttribute("listCart",cartService.listCart());
        model.addAttribute("total",cartService.totalPrice());
        sessionService.setAttribute("listSize",cartService.listCart().size()+"");
        sessionService.setAttribute("listCartSession",cartService.listCart());
        sessionService.setAttribute("toTalSession",cartService.totalPrice()+"");
        return "views/user/shoping-cart";
    }

    @GetMapping("/register")
    String getRegister(@ModelAttribute("createUser") User user,Model model) {
        return "views/user/register";
    }
    @PostMapping("/register")
    String postRegister(@ModelAttribute("createUser") User user,Model model) {
        String email=user.getEmail();
        if(userService.findByEmail(email)==null){
            MailInfo mailInfo=new MailInfo(email,"Register Success","Singup Congratulation");
            try {
                if(mailService.send(mailInfo)==1){
                    model.addAttribute("createSuccess","Success");
                    userService.save(user);
                }else {
                    model.addAttribute("createSuccess","Email invalid");
                }
            }catch (MessagingException e){

            }
        }else {

            model.addAttribute("createSuccess","Email Dupplicate");
        }
        return "views/user/register";
    }

    //ADMIN
    @ModelAttribute("listBrand")
    List<Brands> listBrands(){
        return brandService.listBrand();
    }
    @ModelAttribute("listCategory")
    List<Categories> listCategories(){
        return cateGoryService.listCategory();
    }

    @GetMapping("/adminOverview")
    String getAdminOverview() {
        return "views/admin/adminoverview";
    }

    @GetMapping("/adminMember")
    String getAdminMember() {
        return "views/admin/adminmember";
    }

    @GetMapping("/adminViewMember")
    String getAdminViewProduct() {
        return "views/admin/adminViewMember";
    }

    @GetMapping("/adminProduct")
    String getAdminProduct() {
        return "views/admin/adminproduct";
    }

    @GetMapping("/adminAddProduct")
    String getAdminAddProduct(@ModelAttribute("Addproduct") Products products
            ,@ModelAttribute("AddproductDetail") ProductDetail productDetail,
                              @ModelAttribute("Addproductimg1")Img1 img1,
                              @ModelAttribute("Addproductimg2")Img2 img2,
                              @ModelAttribute("Addproductimg3")Img3 img3,
                              @ModelAttribute("Addproductimg4")Img4 img4,
                              @ModelAttribute("Addproductimg5")Img5 img5) {
        return "views/admin/adminAddProduct";
    }
    @PostMapping("/adminAddProduct")
    String addProduct(@ModelAttribute("Addproduct") Products products,
                      @ModelAttribute("AddproductDetail") ProductDetail productDetail,
                      @ModelAttribute("Addproductimg1")Img1 img1,
                      @ModelAttribute("Addproductimg2")Img2 img2,
                      @ModelAttribute("Addproductimg3")Img3 img3,
                      @ModelAttribute("Addproductimg4")Img4 img4,
                      @ModelAttribute("Addproductimg5")Img5 img5
                      ){

        productService.save(products);
        productDetail.setProducts(products);
        productDetailService.save(productDetail);
            ProductImage productImage1=new ProductImage();
            productImage1.setProducts(products);
            productImage1.setImage_number(1);
            productImage1.setImage_url(img1.getImgUrl1());

        ProductImage productImage2=new ProductImage();
        productImage2.setProducts(products);
        productImage2.setImage_number(2);
        productImage2.setImage_url(img2.getImgUrl2());
        ProductImage productImage3=new ProductImage();
        productImage3.setProducts(products);
        productImage3.setImage_number(3);
        productImage3.setImage_url(img3.getImgUrl3());
        ProductImage productImage4=new ProductImage();
        productImage4.setProducts(products);
        productImage4.setImage_number(4);
        productImage4.setImage_url(img4.getImgUrl4());
        ProductImage productImage5=new ProductImage();
        productImage5.setProducts(products);
        productImage5.setImage_number(5);
        productImage5.setImage_url(img5.getImgUrl5());

        productImageService.save(productImage1);
        productImageService.save(productImage2);
        productImageService.save(productImage3);
        productImageService.save(productImage4);
        productImageService.save(productImage5);


        return "views/admin/adminAddProduct";
    }
    @GetMapping("/adminBill")
    String getAdminBill() {
        return "views/admin/adminBill";
    }

    @GetMapping("/adminViewBill")
    String getAdminViewBill() {
        return "views/admin/adminViewBill";
    }

    @GetMapping("/adminGift")
    String getAdminGift() {
        return "views/admin/admingift";
    }

    @GetMapping("/adminFeedBack")
    String getAdminFeedBack() {
        return "views/admin/adminfeedback";
    }

}
