//-- --------------------------------------------------------
// Pass dòng cod này vào mysql chạy
//        -- Host:                         127.0.0.1
//        -- Server version:               10.4.28-MariaDB - mariadb.org binary distribution
//        -- Server OS:                    Win64
//        -- HeidiSQL Version:             12.5.0.6677
//        -- --------------------------------------------------------
//
//        /*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
//        /*!40101 SET NAMES utf8 */;
//        /*!50503 SET NAMES utf8mb4 */;
//        /*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
//        /*!40103 SET TIME_ZONE='+00:00' */;
//        /*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
//        /*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
//        /*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
//
//
//        -- Dumping database structure for java5springasm
//        CREATE DATABASE IF NOT EXISTS `java5springasm` /*!40100 DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci */;
//        USE `java5springasm`;
//
//        -- Dumping structure for table java5springasm.brands
//        CREATE TABLE IF NOT EXISTS `brands` (
//        `brand_id` int(11) NOT NULL AUTO_INCREMENT,
//        `brand_name` varchar(255) DEFAULT NULL,
//        PRIMARY KEY (`brand_id`)
//        ) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
//
//        -- Dumping data for table java5springasm.brands: ~15 rows (approximately)
//        INSERT INTO `brands` (`brand_id`, `brand_name`) VALUES
//        (1, 'Curnon'),
//        (2, 'COLOSSEUM'),
//        (3, 'KASHMIR'),
//        (4, 'WEIMAR'),
//        (5, 'JACKSON'),
//        (6, 'DETROIT'),
//        (7, 'FUTURA'),
//        (8, 'WHITESANDS'),
//        (9, 'ROLEX'),
//        (10, 'G-FORKS'),
//        (11, 'HAMILTON'),
//        (12, 'MELISSANI'),
//        (13, 'MORAINE'),
//        (14, 'SICILY'),
//        (15, 'AURORA');
//
//        -- Dumping structure for table java5springasm.cart
//        CREATE TABLE IF NOT EXISTS `cart` (
//        `product_cart_id` int(11) NOT NULL AUTO_INCREMENT,
//        `price` double DEFAULT NULL,
//        `product_id_temp` int(11) DEFAULT NULL,
//        `product_img` varchar(255) DEFAULT NULL,
//        `product_name` varchar(255) DEFAULT NULL,
//        `quantity` int(11) DEFAULT NULL,
//        `total` double DEFAULT NULL,
//        PRIMARY KEY (`product_cart_id`)
//        ) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
//
//        -- Dumping data for table java5springasm.cart: ~0 rows (approximately)
//        INSERT INTO `cart` (`product_cart_id`, `price`, `product_id_temp`, `product_img`, `product_name`, `quantity`, `total`) VALUES
//        (4, 2159000, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fg%2Fr%2Fgrace.png&w=640&q=75', 'MORAINE GRACE', 2, 4318000);
//
//        -- Dumping structure for table java5springasm.categories
//        CREATE TABLE IF NOT EXISTS `categories` (
//        `category_id` int(11) NOT NULL AUTO_INCREMENT,
//        `category_name` varchar(255) DEFAULT NULL,
//        PRIMARY KEY (`category_id`)
//        ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
//
//        -- Dumping data for table java5springasm.categories: ~3 rows (approximately)
//        INSERT INTO `categories` (`category_id`, `category_name`) VALUES
//        (1, 'Men\'s watch'),
//        (2, 'Women\'s watch'),
//        (3, 'Acessories');
//
//        -- Dumping structure for table java5springasm.order_detail
//        CREATE TABLE IF NOT EXISTS `order_detail` (
//        `order_detail_id` int(11) NOT NULL AUTO_INCREMENT,
//        `price` double DEFAULT NULL,
//        `quantity` int(11) DEFAULT NULL,
//        `subtotal` double DEFAULT NULL,
//        `order_id` int(11) DEFAULT NULL,
//        `product_id` int(11) DEFAULT NULL,
//        PRIMARY KEY (`order_detail_id`),
//        UNIQUE KEY `UKq6bwjb8y711vixrxinko7wmnw` (`order_id`),
//        UNIQUE KEY `UKnkb731c2u3fxwuln18o6lyx6u` (`product_id`),
//        CONSTRAINT `FK5b0uk7wgmjgml0sey3hl0v9j7` FOREIGN KEY (`order_id`) REFERENCES `_order` (`order_id`),
//        CONSTRAINT `FKc7q42e9tu0hslx6w4wxgomhvn` FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`)
//        ) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
//
//        -- Dumping data for table java5springasm.order_detail: ~0 rows (approximately)
//
//        -- Dumping structure for table java5springasm.products
//        CREATE TABLE IF NOT EXISTS `products` (
//        `product_id` int(11) NOT NULL AUTO_INCREMENT,
//        `product_description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
//        `price` double DEFAULT NULL,
//        `product_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
//        `stock_quantity` int(11) DEFAULT NULL,
//        `brand_id` int(11) DEFAULT NULL,
//        `category_id` int(11) DEFAULT NULL,
//        PRIMARY KEY (`product_id`),
//        KEY `FKa3a4mpsfdf4d2y6r8ra3sc8mv` (`brand_id`),
//        KEY `FKog2rp4qthbtt2lfyhfo32lsw9` (`category_id`),
//        CONSTRAINT `FKa3a4mpsfdf4d2y6r8ra3sc8mv` FOREIGN KEY (`brand_id`) REFERENCES `brands` (`brand_id`),
//        CONSTRAINT `FKog2rp4qthbtt2lfyhfo32lsw9` FOREIGN KEY (`category_id`) REFERENCES `categories` (`category_id`)
//        ) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
//
//        -- Dumping data for table java5springasm.products: ~43 rows (approximately)
//        INSERT INTO `products` (`product_id`, `product_description`, `price`, `product_name`, `stock_quantity`, `brand_id`, `category_id`) VALUES
//        (1, 'Đồng hồ nam Curnon Detroit 8 Mile - thiết kế dành cho các bạn trẻ cá tính, năng động, bụi bặm; Dây kim loại thép không gỉ, Mặt kính Sapphire chống trầy xước, Chống nước 5ATM.', 3039000, 'DETROIT I-275', 12, 1, 1),
//        (2, 'Đồng hồ nữ Curnon Moraine Grace - Đồng hồ nữ Curnon Moraine Grace dành cho những cô nàng có cổ tay nhỏ phù hợp tỏa sáng trong mọi cuộc hẹn, dây kim loại dạng lưới, kính Sapphire chống xước, Chống nước 3ATM,.', 2159000, 'MORAINE GRACE', 12, 1, 2),
//        (3, 'Đồng hồ nam Curnon Kashmir Swank mang vẻ đẹp trẻ trung, khác biệt, nhưng vẫn rất lịch lãm, sang trọng; Dây kim loại, Mặt kính Sapphire chống trầy xước, Chống nước 3ATM', 2799000, 'KASHMIR  SWANK', 12, 3, 1),
//        (4, 'Đồng hồ nam Curnon Kashmir Calm mang phong cách trẻ trung, hiện đại, tối giản, phù hợp với nhiều trang phục; Dây kim loại thép, Mặt kính Sapphire chống trầy xước, Chống nước 3ATM', 2279000, 'KASHMIR  CALM', 12, 3, 1),
//        (5, 'Đồng hồ nam Curnon Weimar Heinz có thiết kế mặt đen nổi bật trên nền kim loại bạc, mang đến nét hiện đại; Dây kim loại, Mặt kính Sapphire chống xước; Chống nước 3ATM.', 2374000, 'WEIMAR  HEINZ', 12, 1, 1),
//        (6, 'Đồng hồ nam Curnon Kashmir Calm mang phong cách trẻ trung, hiện đại, tối giản, phù hợp với nhiều trang phục; Dây kim loại thép, Mặt kính Sapphire chống trầy xước, Chống nước 3ATM', 2279000, 'CALM', 23, 1, 1),
//        (7, 'Đồng hồ nam Curnon Kashmir Calm mang phong cách trẻ trung, hiện đại, tối giản, phù hợp với nhiều trang phục; Dây kim loại thép, Mặt kính Sapphire chống trầy xước, Chống nước 3ATM', 2279000, 'CALM', 23, 1, 1),
//        (8, 'Đồng hồ nam Curnon Kashmir Calm mang phong cách trẻ trung, hiện đại, tối giản, phù hợp với nhiều trang phục; Dây kim loại thép, Mặt kính Sapphire chống trầy xước, Chống nước 3ATM', 2279000, 'CALM', 23, 1, 1),
//        (9, 'Đồng hồ nam Curnon Colosseum Mortar - Thiết kế mạnh mẽ cho người trẻ Việt; Dây da, Kích thước mặt lớn 42mm, Chống nước đến 5ATM, Mặt kính Sapphire chống xước vượt trội...', 2754000, 'MORTAR', 9, 2, 1),
//        (10, 'Đồng hồ nam Colosseum Cannon dây kim loại với lớp áo đen đầy sự huyền bí tôn lên cá tính mạnh mẽ của người đàn ông. Mặt kính Sapphire chống xước vượt trội. Chống nước đến 5ATM', 3039000, 'CANNON', 9, 2, 1),
//        (11, 'Đồng hồ nam Curnon Colosseum Sterling - top 5 best selling, là tuyên ngôn của người đàn ông mạnh mẽ. Dây kim loại thép không gỉ, Chống nước 5ATM, có kim rốn...', 3039000, 'STERLING', 9, 2, 1),
//        (12, 'Đồng hồ nam Curnon Colosseum Nova - Thiết kế mạnh mẽ, bản lĩnh, cuốn hút - Top 5 best selling; Kích thước mặt lớn 42mm, Dây kim loại thép không gỉ, Chống nước đến 5ATM...', 3039000, 'NOVA', 9, 2, 1),
//        (13, 'Đồng hồ nam Curnon Colosseum Guandao mang phong cách mạnh mẽ, trưởng thành, vững chãi; Dây da, Kích thước mặt lớn 42mm, Kính Sapphire chống xước, Chống nước 5ATM vượt trội...\r\n\r\n', 2754000, 'GUANDAO', 9, 3, 1),
//        (14, 'Đồng hồ nam Curnon Kashmir Calm mang phong cách trẻ trung, hiện đại, tối giản, phù hợp với nhiều trang phục; Dây kim loại thép, Mặt kính Sapphire chống trầy xước, Chống nước 3ATM', 2279000, 'CALM', 9, 3, 1),
//        (15, 'Đồng hồ nam Curnon Kashmir Calm mang phong cách trẻ trung, hiện đại, tối giản, phù hợp với nhiều trang phục; Dây kim loại thép, Mặt kính Sapphire chống trầy xước, Chống nước 3ATM', 2184000, 'FEARLESS', 9, 3, 1),
//        (16, 'Đồng hồ nam Curnon Kashmir Grand có thiết kế hiện đại, tối giản, mang phong cách trẻ trung; Dây da, Mặt kính Sapphire chống trầy xước, Chống nước 3ATM, có kim rốn...', 2184000, 'SWANK', 9, 3, 1),
//        (17, 'Đồng hồ Weimar Wolfgang với thiết kế tông màu đen đồng nhất cực kỳ hiện đại mang lại sự nam tính,. Chống nước 3ATM. 1 đổi 1 trong 3 ngày. Bảo hành 10 năm. Miễn phí vận chuyển', 2374000, 'WOLFGANG', 7, 4, 1),
//        (18, 'Đồng hồ nam Curnon Weimar Jurgen với sắc đen huyền bí, hiện đại trên nền thiết kế Bauhaus cổ điển, tạo sự năng động, mạnh mẽ; Dây kim loại, Mặt kính Sapphire chống xước, Chống nước 3ATM', 2374000, 'JURGEN', 7, 4, 1),
//        (19, 'Đồng hồ nam Curnon Weimar Heinz có thiết kế mặt đen nổi bật trên nền kim loại bạc, mang đến nét hiện đại; Dây kim loại, Mặt kính Sapphire chống xước; Chống nước 3ATM...', 2374000, 'HEINZ', 22, 4, 1),
//        (20, 'Đồng hồ nam Curnon Weimar Paul sự kết hợp giữa mặt kính vòm, sắc đen cùng rosegold đầy quyến rũ, mang đến vẻ đẹp sang trọng; Dây da, Mặt kính Sapphire chống trầy, Chống nước 3ATM', 2279000, 'PAUL', 15, 4, 1),
//        (21, 'Đồng hồ Curnon Weimar Herbert dành cho các chàng trai yêu thích phong cách cổ điển và tinh tế. Chống nước 3ATM. 1 đổi 1 trong 3 ngày. Bảo hành 10 năm. Miễn phí vận chuyển', 2279000, 'HERBERT', 15, 4, 1),
//        (22, 'Đồng hồ Lặn đầu tiên đến từ một thương hiệu Việt. 5 phối màu vòng Bezel cá tính. Chống nước lên đến 10ATM. 1 đổi 1 trong vòng 3 ngày. Bảo hành 10 năm.', 2969000, 'SANDSTORM', 15, 5, 1),
//        (23, 'Đồng hồ nam Curnon Detroit US-12 có thiết kế đậm chất đường phố bụi bặm dành cho người trẻ Việt; Dây kim loại thép không gỉ, Mặt kính Sapphire chống trầy xước, Chống nước 5ATM', 3039000, 'US-12', 11, 6, 1),
//        (24, 'Đồng hồ nam Whitesands Wander có thiết kế năng động cùng lựa chọn dây Nato màu be cá tính sẽ là người đồng hành đại diện cho cảm hứng dịch chuyển của tuổi trẻ. Kích thước mặt 38mm. Chống nước 3ATM.', 1424000, 'WANDER', 12, 8, 1),
//        (25, 'Đồng hồ nam Whitesands Wander có thiết kế năng động cùng lựa chọn dây Nato màu be cá tính sẽ là người đồng hành đại diện cho cảm hứng dịch chuyển của tuổi trẻ. Kích thước mặt 38mm. Chống nước 3ATM.', 1424000, 'WANDER', 12, 8, 1),
//        (26, 'Đồng hồ nam Whitesands Range có thiết kế năng động cùng lựa chọn dây Nato đen khác biệt sẽ là người đồng hành đại diện cho cảm hứng dịch chuyển của tuổi trẻ. Kích thước mặt 38mm. Chống nước 3ATM.', 1424000, 'RANGE', 23, 8, 1),
//        (27, 'Đồng hồ nam Whitesands Aspire có thiết kế năng động cùng lựa chọn dây Nato ghi khác biệt sẽ là người đồng hành đại diện cho cảm hứng dịch chuyển của tuổi trẻ. Kích thước mặt 38mm. Chống nước 3ATM.', 1424000, 'ASPIRE', 23, 8, 1),
//        (28, 'Được đặt tên theo dòng trực thăng chiến đấu, Apache phối màu xanh-xám với dây vải nato mang đến vẻ ngoài tự do, phóng khoáng cho phái mạnh, mặt kính Sapphire chống trầy xước giúp bạn thoải mái vận động, chơi thể thao…', 1699000, 'APACHE', 12, 10, 1),
//        (29, 'Sản phẩm được lấy cảm hứng từ dòng chuyên cơ Hornet, với màu xám lì, tạo cảm giác khoẻ khoắn, cùng với cọc số được in rõ ràng, chống nước 3ATM, mặt kính Sapphire chống trầy xước.', 1699000, 'HORNET', 12, 10, 1),
//        (30, 'Sản phẩm được lấy cảm hứng từ dòng chuyên cơ Hornet, với màu xám lì, tạo cảm giác khoẻ khoắn, cùng với cọc số được in rõ ràng, chống nước 3ATM, mặt kính Sapphire chống trầy xước.', 1699000, 'HORNET', 12, 10, 1),
//        (31, 'Sản phẩm được lấy cảm hứng từ dòng chuyên cơ Hornet, với màu xám lì, tạo cảm giác khoẻ khoắn, cùng với cọc số được in rõ ràng, chống nước 3ATM, mặt kính Sapphire chống trầy xước.', 1699000, 'HORNET', 12, 10, 1),
//        (32, 'Đồng hồ nữ Curnon Hamilton Cora đại diện cho tinh thần tràn đầy năng lượng của những cô gái hiện đại. Mẫu đồng hồ có dạng dây lưới kim loại, kính sapphire, chống nước chuẩn 3ATM...', 2159000, 'CORA', 12, 11, 2),
//        (33, 'Đồng hồ nữ Melissani Sky với thiết kế tối giản, hiện đại, phù hợp với những cô nàng yêu thích phong cách trẻ trung, đơn giản; Dây da, Mặt kính Sapphire chống trầy, Chống nước 3ATM', 2159000, 'CORA', 12, 12, 2),
//        (34, 'Đồng hồ thời trang nữ Melissani Haze mang đến thiết kế hiện đại, sang trọng, phù hợp với mọi phong cách từ công sở đến những bộ cánh đơn giản hằng ngày.', 2159000, 'HAZE', 12, 12, 2),
//        (35, 'Đồng hồ Curnon Melissani Autumn dây kim loại với tông màu Rose Gold chủ đạo mang đến nét đẹp quyến rũ và nữ tính. 1 đổi 1 trong 3 ngày. Bảo hành 10 năm. Miễn phí vận chuyển', 2159000, 'AUTUMN', 12, 12, 2),
//        (36, 'Đồng hồ nữ Curnon Moraine Grace dành cho những cô nàng có cổ tay nhỏ phù hợp tỏa sáng trong mọi cuộc hẹn, dây kim loại dạng lưới, kính Sapphire chống xước, Chống nước 3ATM,...', 2159000, 'GRACE', 12, 13, 2),
//        (37, 'Bellini phối màu mặt xanh phá cách khắc hoạ một nguồn năng lượng tươi trẻ, rộn ràng từ Sicily Bellini. 1 đổi 1 trong 3 ngày. Bảo hành 10 năm. Miễn phí vận chuyển.', 1889000, 'BELLINI', 12, 14, 2),
//        (38, '“Sang trọng” chính là tính từ duy nhất đủ lột tả mọi vẻ đẹp trước phối màu hồng - trắng của Sicily Emanuel.', 1889000, 'EMANUEL', 12, 14, 2),
//        (39, 'Nét tối giản từ phối màu bạc trắng của Sicily Gari sẽ là sự lựa chọn hoàn hảo cho các cô nàng chỉn chu, hiện đại.', 1889000, 'GARI', 12, 14, 2),
//        (40, 'Sicily Massimo mang đầy vẻ nữ tính, điệu đà, uyển chuyển qua sắc hồng đặc trưng tô điểm toàn bộ thiết kế.\r\n\r\n', 1889000, 'MASSIMO', 12, 14, 2),
//        (41, 'Citrine sở hữu năng lượng tích cực cho tinh thần của người đeo. Citrine là chiếc có phối màu độc đáo nhất - màu vàng 14K, lần đầu tiên xuất hiện trên đồng hồ nữ của Curnon. Phối màu vàng đậm chất cổ điển, phù hợp cho outfit có tông ấm.\r\n\r\n', 2239000, 'CITRINE', 12, 14, 2),
//        (42, 'Aquamarine mang năng lượng tràn đầy tự tin, vượt qua cảm xúc và bày tỏ chính kiến của bản thân. Aquamarine có phối màu xanh dương độc đáo, tạo điểm nhấn và ấn tượng mạnh ngay từ cái nhìn đầu tiên.\r\n\r\n', 2239000, 'AQUAMARINE', 12, 15, 2),
//        (43, 'Morganite tượng trưng cho vẻ đẹp nhẹ nhàng và nữ tính của phụ nữ. Phối màu mặt trắng và dây hồng nhạt tạo cảm giác thanh thoát và dịu dàng cho người đeo.\r\n\r\n', 2239000, 'MORGANITE', 12, 15, 2),
//        (44, 'Moonstone mang năng lực thanh tẩy và cân bằng cơ thể. Màu bạc có độ bền màu cao, đậm chất cổ điển, dễ dàng phối màu với các trang phục khác.', 2239000, 'MOONSTONE', 12, 15, 2),
//        (45, 'Nhẫn bạc nam GRENEN - một sản phẩm ra đời từ sự kết hợp giữa Curnon và Helios. Mặt nhẫn được thiết kế độc đáo, có thể xoay lật 2 chiều, đổi mặt tùy theo phong cách và tâm trạng. Chất liệu bạc 925 toát lên vẻ vừa mạnh mẽ, vừa sang trọng và uyển chuyển.', 1095000, 'NHẪN GRENEN SILVER', 12, 1, 3);
//
//        -- Dumping structure for table java5springasm.product_details
//        CREATE TABLE IF NOT EXISTS `product_details` (
//        `product_detail_id` int(11) NOT NULL AUTO_INCREMENT,
//        `product_condition` bit(1) DEFAULT NULL,
//        `case_color` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
//        `dial_color` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
//        `glass_material` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
//        `movement` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
//        `origin` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
//        `shape` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
//        `sku` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
//        `user_target` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
//        `water_resistance` bit(1) DEFAULT NULL,
//        `product_id` int(11) DEFAULT NULL,
//        PRIMARY KEY (`product_detail_id`),
//        KEY `FKnfvvq3meg4ha3u1bju9k4is3r` (`product_id`),
//        CONSTRAINT `FKnfvvq3meg4ha3u1bju9k4is3r` FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`)
//        ) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
//
//        -- Dumping data for table java5springasm.product_details: ~43 rows (approximately)
//        INSERT INTO `product_details` (`product_detail_id`, `product_condition`, `case_color`, `dial_color`, `glass_material`, `movement`, `origin`, `shape`, `sku`, `user_target`, `water_resistance`, `product_id`) VALUES
//        (1, b'0', 'Vàng hồng', 'Black', 'Sapphire', 'Curnon Detroit 8 Mile', 'Thụy Sỹ', 'MIYOTA QUARTZ', 'RM 65-01', 'Nam', b'1', 1),
//        (2, b'0', 'Vàng Kim', 'Black', 'Sapphire', 'Curnon Moraine Grace', 'Nhật Bản', 'MIYOTA QUARTZ', 'RWM 62-02', 'Nu', b'1', 2),
//        (3, b'0', 'Bạc', 'NAVY', 'SAPPHIRE', 'MIYOTA QUARTZ', 'Thụy Sĩ', 'Tròn', 'THY-980', 'Nam', b'1', 3),
//        (4, b'0', 'Bạc', 'WHITE', 'SAPPHIRE', 'MIYOTA QUARTZ', 'Thụy Sĩ', 'Tròn', 'WHM-098', 'Nam', b'1', 4),
//        (5, b'0', 'Bạc', 'BLACK', 'SAPPHIRE', 'MIYOTA QUARTZ', 'Thụy Sĩ', 'Tròn', 'HNM-098', 'Nam', b'1', 5),
//        (6, b'0', 'WHITE', 'WHITE', 'SAPPHIRE', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nam', b'1', 6),
//        (7, b'0', 'WHITE', 'WHITE', 'SAPPHIRE', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nam', b'1', 7),
//        (8, b'0', 'WHITE', 'WHITE', 'SAPPHIRE', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nam', b'1', 8),
//        (9, b'0', 'BLACK', 'BLACK', 'SAPPHIRE', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nam', b'1', 9),
//        (10, b'0', 'BLACK', 'BLACK', 'SAPPHIRE', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nam', b'1', 10),
//        (11, b'0', 'NAVY', 'BLACK', 'SAPPHIRE', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nam', b'1', 11),
//        (12, b'0', 'BLACK', 'BLACK', 'SAPPHIRE', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nam', b'1', 12),
//        (13, b'0', 'WHITE', 'WHITE', 'SAPPHIRE', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nam', b'1', 13),
//        (14, b'0', 'WHITE', 'WHITE', 'SAPPHIRE', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nam', b'1', 14),
//        (15, b'0', 'WHITE', 'WHITE', 'SAPPHIRE', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nam', b'1', 15),
//        (16, b'0', 'NAVY', 'BLUE', 'SAPPHIRE', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nam', b'1', 16),
//        (17, b'0', 'NAVY', 'BLACK', 'SAPPHIRE', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nam', b'1', 17),
//        (18, b'0', 'NAVY', 'BLACK', 'SAPPHIRE', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nam', b'1', 18),
//        (19, b'0', 'NAVY', 'BLACK', 'SAPPHIRE', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nam', b'1', 19),
//        (20, b'0', 'NAVY', 'BLACK', 'SAPPHIRE', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nam', b'1', 20),
//        (21, b'0', 'BLACK', 'BLACK', 'SAPPHIRE', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nam', b'1', 21),
//        (22, b'0', 'BLACK', 'BLACK', 'SAPPHIRE', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nam', b'1', 22),
//        (23, b'0', 'BLACK', 'BLACK', 'SAPPHIRE', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nam', b'1', 23),
//        (24, b'0', 'NAVY', 'NAVY', 'MINERAL', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nam', b'1', 24),
//        (25, b'0', 'NAVY', 'NAVY', 'MINERAL', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nam', b'1', 25),
//        (26, b'0', 'BLACK', 'BLACK', 'MINERAL', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nam', b'1', 26),
//        (27, b'0', 'GREY', 'BLACK', 'MINERAL', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nam', b'1', 27),
//        (28, b'0', 'NAVY', 'NAVY', 'SAPPHIRE', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nam', b'1', 28),
//        (29, b'0', 'NAVY', 'NAVY', 'SAPPHIRE', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nam', b'1', 29),
//        (30, b'0', 'NAVY', 'NAVY', 'SAPPHIRE', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nam', b'1', 30),
//        (31, b'0', 'NAVY', 'NAVY', 'SAPPHIRE', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nam', b'1', 31),
//        (32, b'0', 'PINK', 'PINK', 'SAPPHIRE', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nu', b'1', 32),
//        (33, b'0', 'WHITE', 'PINK', 'SAPPHIRE', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nu', b'1', 33),
//        (34, b'0', 'WHITE', 'BLACK', 'SAPPHIRE', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nu', b'1', 34),
//        (35, b'0', 'PINK', 'PINK', 'SAPPHIRE', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nu', b'1', 35),
//        (36, b'0', 'PINK', 'BLACK', 'SAPPHIRE', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nu', b'1', 36),
//        (37, b'0', 'PINK', 'NAVY', 'SAPPHIRE', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nu', b'1', 37),
//        (38, b'0', 'PINK', 'WHITE', 'MINERAL', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nu', b'1', 38),
//        (39, b'0', 'WHITE', 'WHITE', 'MINERAL', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nu', b'1', 39),
//        (40, b'0', 'PINK', 'PINK', 'MINERAL', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nu', b'1', 40),
//        (41, b'0', 'GOLD', 'GOLD', 'MINERAL', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nu', b'1', 41),
//        (42, b'0', 'Bạc', 'BLUE', 'MINERAL', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nu', b'1', 42),
//        (43, b'0', 'PINK', 'GREY', 'MINERAL', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nu', b'1', 43),
//        (44, b'0', 'GREY', 'GREY', 'MINERAL', 'MIYOTA QUARTZ', 'Thuỵ Sỹ', 'Tròn', '', 'Nu', b'1', 44),
//        (45, b'0', 'SILVER', 'SILVER', '', '', '', '', '', 'Nam', b'1', 45);
//
//        -- Dumping structure for table java5springasm.product_images
//        CREATE TABLE IF NOT EXISTS `product_images` (
//        `product_image_id` int(11) NOT NULL AUTO_INCREMENT,
//        `image_number` int(11) DEFAULT NULL,
//        `image_url` varchar(255) DEFAULT NULL,
//        `product_id` int(11) DEFAULT NULL,
//        PRIMARY KEY (`product_image_id`),
//        KEY `FKqnq71xsohugpqwf3c9gxmsuy` (`product_id`),
//        CONSTRAINT `FKqnq71xsohugpqwf3c9gxmsuy` FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`)
//        ) ENGINE=InnoDB AUTO_INCREMENT=224 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
//
//        -- Dumping data for table java5springasm.product_images: ~213 rows (approximately)
//        INSERT INTO `product_images` (`product_image_id`, `image_number`, `image_url`, `product_id`) VALUES
//        (1, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fi%2F-%2Fi-275_1.png&w=640&q=75', 1),
//        (2, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fk%2F5%2Fk5-mn2_2_1.png&w=640&q=75', 1),
//        (3, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fd%2Fs%2Fdsc07056_1.jpg&w=640&q=75', 1),
//        (4, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fd%2Fs%2Fdsc06973.jpg&w=640&q=75', 1),
//        (5, 5, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fd%2Fs%2Fdsc06989_1.jpg&w=640&q=75', 1),
//        (6, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fg%2Fr%2Fgrace.png&w=640&q=75', 2),
//        (7, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fg%2Fr%2Fgrace.2.png&w=640&q=75', 2),
//        (8, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F_%2Fa%2F_ann9749.jpg&w=640&q=75', 2),
//        (9, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fg%2Fr%2Fgrace_1.jpg&w=640&q=75', 2),
//        (10, 5, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F_%2Fa%2F_ann0392.jpg&w=640&q=75', 2),
//        (11, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fb%2Fx%2Fbx.swank.png&w=640&q=75', 3),
//        (12, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fb%2Fx%2Fbx.swank.2.png&w=640&q=75', 3),
//        (13, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F4%2F_%2F4_1_2.jpg&w=640&q=75', 3),
//        (14, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fl%2Fb%2Flbkm.swank1-min.jpg&w=640&q=75', 3),
//        (15, 5, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fd%2Fs%2Fdsc_2852_1_.jpg&w=640&q=75', 3),
//        (16, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fb%2Ft%2Fbt.calm.png&w=640&q=75', 4),
//        (17, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fb%2Fr%2Fbr.dapper.2.png&w=640&q=75', 4),
//        (18, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F2%2F_%2F2_1_2_.jpg&w=640&q=75', 4),
//        (19, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fc%2Fa%2Fcalm_3.jpg&w=640&q=75', 4),
//        (20, 5, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fc%2Fa%2Fcalm.jpg.jpg&w=640&q=75', 4),
//        (21, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fh%2Fe%2Fheinz_1.png&w=640&q=75', 5),
//        (22, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F_%2Fn%2F_ndp7961.1.jpg&w=640&q=75', 5),
//        (23, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fa%2Fn%2Fann_8988finalllllll_1.jpg&w=640&q=75', 5),
//        (24, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fd%2Fs%2Fdsc_3639.jpg&w=640&q=75', 5),
//        (25, 5, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fh%2Fe%2Fheinz_1.png&w=640&q=75', 5),
//        (26, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fb%2Ft%2Fbt.calm.png&w=640&q=75', 6),
//        (27, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fb%2Fr%2Fbr.dapper.2.png&w=640&q=75', 6),
//        (28, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F2%2F_%2F2_1_2_.jpg&w=640&q=75', 6),
//        (29, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fc%2Fa%2Fcalm_3.jpg&w=640&q=75', 6),
//        (30, 5, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fc%2Fa%2Fcalm.jpg.jpg&w=640&q=75', 6),
//        (31, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fb%2Ft%2Fbt.calm.png&w=640&q=75', 7),
//        (32, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fb%2Fr%2Fbr.dapper.2.png&w=640&q=75', 7),
//        (33, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F2%2F_%2F2_1_2_.jpg&w=640&q=75', 7),
//        (34, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fc%2Fa%2Fcalm_3.jpg&w=640&q=75', 7),
//        (35, 5, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fc%2Fa%2Fcalm.jpg.jpg&w=640&q=75', 7),
//        (36, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fb%2Ft%2Fbt.calm.png&w=640&q=75', 8),
//        (37, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fb%2Fr%2Fbr.dapper.2.png&w=640&q=75', 8),
//        (38, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F2%2F_%2F2_1_2_.jpg&w=640&q=75', 8),
//        (39, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fc%2Fa%2Fcalm_3.jpg&w=640&q=75', 8),
//        (40, 5, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fc%2Fa%2Fcalm.jpg.jpg&w=640&q=75', 8),
//        (41, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fm%2Fo%2Fmotar.png&w=640&q=75', 9),
//        (42, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fm%2Fo%2Fmotar2.png&w=640&q=75', 9),
//        (43, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fm%2Fo%2Fmortar_3.jpg&w=640&q=75', 9),
//        (44, 4, '', 9),
//        (45, 5, '', 9),
//        (46, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fc%2Fa%2Fcannon.png&w=640&q=75', 10),
//        (47, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fc%2Fa%2Fcannon2.png&w=640&q=75', 10),
//        (48, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fc%2Fa%2Fcannon.2.jpg&w=640&q=75', 10),
//        (49, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fc%2Fa%2Fcannon.1.jpg&w=640&q=75', 10),
//        (50, 5, '', 10),
//        (51, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fs%2Ft%2Fsterling.png&w=640&q=75', 11),
//        (52, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fs%2Ft%2Fsterling.2.png&w=640&q=75', 11),
//        (53, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fs%2Ft%2Fsterling_1.jpg&w=640&q=75', 11),
//        (54, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fs%2Ft%2Fsterling_2.jpg&w=640&q=75', 11),
//        (55, 5, '', 11),
//        (56, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fn%2Fo%2Fnova.png&w=640&q=75', 12),
//        (57, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fn%2Fo%2Fnova.2.png&w=640&q=75', 12),
//        (58, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fn%2Fo%2Fnova_8_.jpg&w=640&q=75', 12),
//        (59, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fn%2Fo%2Fnova.2_1.jpg&w=640&q=75', 12),
//        (60, 5, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fn%2Fo%2Fnova.jpg&w=640&q=75', 12),
//        (61, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fg%2Fu%2Fguandao.png&w=640&q=75', 13),
//        (62, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fg%2Fu%2Fguandao-2.png&w=640&q=75', 13),
//        (63, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F8%2F_%2F8_1.jpg&w=640&q=75', 13),
//        (64, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fg%2Fu%2Fguandao.jpg&w=640&q=75', 13),
//        (65, 5, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fg%2Fu%2Fguandao.2.jpg&w=640&q=75', 13),
//        (66, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fb%2Ft%2Fbt.calm.png&w=640&q=75', 14),
//        (67, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fb%2Fr%2Fbr.dapper.2.png&w=640&q=75', 14),
//        (68, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F2%2F_%2F2_1_2_.jpg&w=640&q=75', 14),
//        (69, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fc%2Fa%2Fcalm_3.jpg&w=640&q=75', 14),
//        (70, 5, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fc%2Fa%2Fcalm.jpg.jpg&w=640&q=75', 14),
//        (71, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fb%2Ft%2Fbt.calm.png&w=640&q=75', 15),
//        (72, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fb%2Fr%2Fbr.dapper.2.png&w=640&q=75', 15),
//        (73, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F2%2F_%2F2_1_2_.jpg&w=640&q=75', 15),
//        (74, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fc%2Fa%2Fcalm_3.jpg&w=640&q=75', 15),
//        (75, 5, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fc%2Fa%2Fcalm.jpg.jpg&w=640&q=75', 15),
//        (76, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fb%2Fx%2Fbx.grand.png&w=640&q=75', 16),
//        (77, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fb%2Fx%2Fbx.grand.2.png&w=640&q=75', 16),
//        (78, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F2%2F_%2F2_2.jpg&w=640&q=75', 16),
//        (79, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fg%2Fr%2Fgrand_1.jpg&w=640&q=75', 16),
//        (80, 5, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fl%2Fb%2Flbkm.grand_1.jpg&w=640&q=75', 16),
//        (81, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fw%2Fo%2Fwolfgang.png&w=640&q=75', 17),
//        (82, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fw%2Fo%2Fwolfgang2.png&w=640&q=75', 17),
//        (83, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fc%2Fu%2Fcurnon249_1.jpg&w=640&q=75', 17),
//        (84, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F_%2Fn%2F_ndp9076_cropped.jpg&w=640&q=75', 17),
//        (85, 5, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F_%2Fn%2F_ndp9074_cropped.jpg&w=640&q=75', 17),
//        (86, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fj%2Fu%2Fjurgen_1_.png&w=640&q=75', 18),
//        (87, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fg%2F_%2Fg.jurgen.2.png&w=640&q=75', 18),
//        (88, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fj%2Fu%2Fjurgen.jpg&w=640&q=75', 18),
//        (89, 4, '', 18),
//        (90, 5, '', 18),
//        (91, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fh%2Fe%2Fheinz_1.png&w=640&q=75', 19),
//        (92, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fh%2Fe%2Fheinz_2.png&w=640&q=75', 19),
//        (93, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F_%2Fn%2F_ndp7961.1.jpg&w=640&q=75', 19),
//        (94, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fa%2Fn%2Fann_8988finalllllll_1.jpg&w=640&q=75', 19),
//        (95, 5, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fd%2Fs%2Fdsc_3639.jpg&w=640&q=75', 19),
//        (96, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fp%2Fa%2Fpaul.png&w=640&q=75', 20),
//        (97, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fp%2Fa%2Fpaul_2.png&w=640&q=75', 20),
//        (98, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fp%2Fa%2Fpaul.jpg&w=640&q=75', 20),
//        (99, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fp%2Fh%2Fph.l.4.jpg&w=640&q=75', 20),
//        (100, 5, '', 20),
//        (101, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fh%2Fe%2Fherbert.png&w=640&q=75', 21),
//        (102, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fh%2Fe%2Fherbert_2.png&w=640&q=75', 21),
//        (103, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fp%2Fh%2Fph2.jpg&w=640&q=75', 21),
//        (104, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fp%2Fh%2Fph.l.1_1_cropped.jpg&w=640&q=75', 21),
//        (105, 5, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F3%2F_%2F3_1_.jpg&w=640&q=75', 21),
//        (106, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fs%2Fa%2Fsandstorm_1.png&w=640&q=75', 22),
//        (107, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fj%2Fk%2Fjksn-5-3-final-f-crpped_1.png&w=640&q=75', 22),
//        (108, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F8%2F_%2F8_2.jpg&w=640&q=75', 22),
//        (109, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fu%2Fn%2Funtitled_capture9245_1.jpg&w=640&q=75', 22),
//        (110, 5, '', 22),
//        (111, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fu%2Fs%2Fus12-01_1.png&w=640&q=75', 23),
//        (112, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fk%2F1%2Fk1-mn3_1.png&w=640&q=75', 23),
//        (113, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fu%2Fs%2Fus-12_1.jpg&w=640&q=75', 23),
//        (114, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fd%2Fs%2Fdsc06728.jpg&w=640&q=75', 23),
//        (115, 5, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fv%2F3%2Fv3_1.jpg&w=640&q=75', 23),
//        (116, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F1%2F_%2F1_brown4_1_1.png&w=640&q=75', 24),
//        (117, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F2%2F_%2F2_brown2.png&w=640&q=75', 24),
//        (118, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F3%2F_%2F3_brown2.png&w=640&q=75', 24),
//        (119, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fw%2Fa%2Fwander1.jpg&w=640&q=75', 24),
//        (120, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F1%2F_%2F1_brown4_1_1.png&w=640&q=75', 25),
//        (121, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F2%2F_%2F2_brown2.png&w=640&q=75', 25),
//        (122, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F3%2F_%2F3_brown2.png&w=640&q=75', 25),
//        (123, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fw%2Fa%2Fwander1.jpg&w=640&q=75', 25),
//        (124, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F1%2F_%2F1_black5.png&w=640&q=75', 26),
//        (125, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F2%2F_%2F2_black2_2_1.png&w=640&q=75', 26),
//        (126, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F3%2F_%2F3_black2_1.png&w=640&q=75', 26),
//        (127, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fr%2Fa%2Frange1.jpg&w=640&q=75', 26),
//        (128, 5, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fr%2Fa%2Frange2.jpg&w=640&q=75', 26),
//        (129, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F1%2F_%2F1_green5_2.png&w=640&q=75', 27),
//        (130, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F2%2F_%2F2_green2_1.png&w=640&q=75', 27),
//        (131, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F3%2F_%2F3_green3.png&w=640&q=75', 27),
//        (132, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fa%2Fs%2Faspire1.jpg&w=640&q=75', 27),
//        (133, 5, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fa%2Fs%2Faspire2.jpg&w=640&q=75', 27),
//        (134, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fw%2Fe%2Fweb_-_apache_du_1.png&w=640&q=75', 28),
//        (135, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fw%2Fe%2Fweb_-_apache_du_2.jpg&w=640&q=75', 28),
//        (136, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fa%2Fp%2Fapache_lifestyle_1.jpg&w=640&q=75', 28),
//        (137, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fa%2Fp%2Fapache_lifestyle_2.jpg&w=640&q=75', 28),
//        (138, 5, '', 28),
//        (139, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fw%2Fe%2Fweb_-_hornet_du_1_1_.png&w=640&q=75', 29),
//        (140, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fw%2Fe%2Fweb_-_hornet_du_2.jpg&w=640&q=75', 29),
//        (141, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fa%2Fp%2Fapache_lifestyle_1_copy.jpg&w=640&q=75', 29),
//        (142, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fh%2Fo%2Fhornet_lifestyle_2.jpg&w=640&q=75', 29),
//        (143, 5, '', 29),
//        (144, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fw%2Fe%2Fweb_-_hornet_du_1_1_.png&w=640&q=75', 30),
//        (145, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fw%2Fe%2Fweb_-_hornet_du_2.jpg&w=640&q=75', 30),
//        (146, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fa%2Fp%2Fapache_lifestyle_1_copy.jpg&w=640&q=75', 30),
//        (147, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fh%2Fo%2Fhornet_lifestyle_2.jpg&w=640&q=75', 30),
//        (148, 5, '', 30),
//        (149, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fw%2Fe%2Fweb_-_hornet_du_1_1_.png&w=640&q=75', 31),
//        (150, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fw%2Fe%2Fweb_-_hornet_du_2.jpg&w=640&q=75', 31),
//        (151, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fa%2Fp%2Fapache_lifestyle_1_copy.jpg&w=640&q=75', 31),
//        (152, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fh%2Fo%2Fhornet_lifestyle_2.jpg&w=640&q=75', 31),
//        (153, 5, '', 31),
//        (154, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fc%2Fo%2Fcora.1.png&w=640&q=75', 32),
//        (155, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fc%2Fo%2Fcora.2.png&w=640&q=75', 32),
//        (156, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fd%2Fx%2Fdx-01319-copy.jpg&w=640&q=75', 32),
//        (157, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fc%2Fo%2Fcora.jpg&w=640&q=75', 32),
//        (158, 5, '', 32),
//        (159, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fs%2Fk%2Fsky.png&w=640&q=75', 33),
//        (160, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fs%2Fk%2Fsky.jpg&w=640&q=75', 33),
//        (161, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fs%2Fk%2Fsky.2.png&w=640&q=75', 33),
//        (162, 4, '', 33),
//        (163, 5, '', 33),
//        (164, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fh%2Fa%2Fhaze.png&w=640&q=75', 34),
//        (165, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fh%2Fa%2Fhaze.2.png&w=640&q=75', 34),
//        (166, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fi%2Fm%2Fimg_2420-min.jpg&w=640&q=75', 34),
//        (167, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fi%2Fm%2Fimg_1817.jpeg&w=640&q=75', 34),
//        (168, 5, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F9%2F_%2F9_2_.jpg&w=640&q=75', 34),
//        (169, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fa%2Fu%2Fautumn_1.png&w=640&q=75', 35),
//        (170, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fa%2Fu%2Fautumn.2.png&w=640&q=75', 35),
//        (171, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fa%2Fu%2Fautumn.jpg&w=640&q=75', 35),
//        (172, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F3%2F_%2F3.3.jpg&w=640&q=75', 35),
//        (173, 5, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F5%2F_%2F5.jpg&w=640&q=75', 35),
//        (174, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fg%2Fr%2Fgrace.png&w=640&q=75', 36),
//        (175, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fg%2Fr%2Fgrace.2.png&w=640&q=75', 36),
//        (176, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fg%2Fr%2Fgrace.jpg&w=640&q=75', 36),
//        (177, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F_%2Fa%2F_ann9749.jpg&w=640&q=75', 36),
//        (178, 5, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F_%2Fa%2F_ann0392.jpg&w=640&q=75', 36),
//        (179, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fb%2Fe%2Fbellini_2.png&w=640&q=75', 37),
//        (180, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fb%2Fe%2Fbellini-2.png&w=640&q=75', 37),
//        (181, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fb%2Fe%2Fbellini-3_2.png&w=640&q=75', 37),
//        (182, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fa%2Fr%2Fartboard_1.jpg&w=640&q=75', 37),
//        (183, 5, '', 37),
//        (184, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fe%2Fm%2Femanuel.png&w=640&q=75', 38),
//        (185, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fe%2Fm%2Femanuel-2.png&w=640&q=75', 38),
//        (186, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fe%2Fm%2Femanuel-3.png&w=640&q=75', 38),
//        (187, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fa%2Fr%2Fartboard_3_2_.jpg&w=640&q=75', 38),
//        (188, 5, '', 38),
//        (189, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fg%2Fa%2Fgari.png&w=640&q=75', 39),
//        (190, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fg%2Fa%2Fgari-2.png&w=640&q=75', 39),
//        (191, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fg%2Fa%2Fgari-3.png&w=640&q=75', 39),
//        (192, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fa%2Fr%2Fartboard_5.jpg&w=640&q=75', 39),
//        (193, 5, '', 39),
//        (194, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fm%2Fa%2Fmassimo.png&w=640&q=75', 40),
//        (195, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fm%2Fa%2Fmassimo-2.png&w=640&q=75', 40),
//        (196, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fm%2Fa%2Fmassimo-3.png&w=640&q=75', 40),
//        (197, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fa%2Fr%2Fartboard_4.jpg&w=640&q=75', 40),
//        (198, 5, '', 40),
//        (199, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F1%2F_%2F1_2.png&w=640&q=75', 41),
//        (200, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F5%2F_%2F5_4.png&w=640&q=75', 41),
//        (201, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F1%2F2%2F12_1.png&w=640&q=75', 41),
//        (202, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fa%2Fu%2Faurora-07-001.jpg&w=640&q=75', 41),
//        (203, 5, '', 41),
//        (204, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F4%2F_%2F4_2.png&w=640&q=75', 42),
//        (205, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F8%2F_%2F8.png&w=640&q=75', 42),
//        (206, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F1%2F1%2F11.png&w=640&q=75', 42),
//        (207, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F1%2F1%2F11.png&w=640&q=75', 42),
//        (208, 5, '', 42),
//        (209, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F3%2F_%2F3_2.png&w=640&q=75', 43),
//        (210, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F6%2F_%2F6.png&w=640&q=75', 43),
//        (211, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fa%2Fu%2Faurora-01-001.jpg&w=640&q=75', 43),
//        (212, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fa%2Fu%2Faurora-02-001.jpg&w=640&q=75', 43),
//        (213, 5, '', 43),
//        (214, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F2%2F_%2F2_1_.png&w=640&q=75', 44),
//        (215, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F7%2F_%2F7.png&w=640&q=75', 44),
//        (216, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fa%2Fu%2Faurora-10-001.jpg&w=640&q=75', 44),
//        (217, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2Fa%2Fu%2Faurora-11-001.jpg&w=640&q=75', 44),
//        (218, 5, '', 44),
//        (219, 1, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F1%2F-%2F1-1_3.png&w=640&q=75', 45),
//        (220, 2, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F5%2F_%2F5_6.png&w=640&q=75', 45),
//        (221, 3, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F2%2F-%2F2-1_2.png&w=640&q=75', 45),
//        (222, 4, 'https://curnonwatch.com/_next/image/?url=https%3A%2F%2Fshop.curnonwatch.com%2Fmedia%2Fcatalog%2Fproduct%2F3%2F-%2F3-1_3.png&w=640&q=75', 45),
//        (223, 5, '', 45);
//
//        -- Dumping structure for table java5springasm._order
//        CREATE TABLE IF NOT EXISTS `_order` (
//        `order_id` int(11) NOT NULL AUTO_INCREMENT,
//        `order_address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
//        `order_date` date DEFAULT NULL,
//        `phone_number` varchar(255) DEFAULT NULL,
//        `status` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
//        `user_id` int(11) DEFAULT NULL,
//        PRIMARY KEY (`order_id`),
//        KEY `FKprpwig2d34d265to98qdg694e` (`user_id`),
//        CONSTRAINT `FKprpwig2d34d265to98qdg694e` FOREIGN KEY (`user_id`) REFERENCES `_user` (`user_id`)
//        ) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
//
//        -- Dumping data for table java5springasm._order: ~0 rows (approximately)
//
//        -- Dumping structure for table java5springasm._user
//        CREATE TABLE IF NOT EXISTS `_user` (
//        `user_id` int(11) NOT NULL AUTO_INCREMENT,
//        `active` bit(1) DEFAULT NULL,
//        `email` varchar(255) DEFAULT NULL,
//        `fullname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
//        `user_password` varchar(255) DEFAULT NULL,
//        PRIMARY KEY (`user_id`)
//        ) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
//
//        -- Dumping data for table java5springasm._user: ~3 rows (approximately)
//        INSERT INTO `_user` (`user_id`, `active`, `email`, `fullname`, `user_password`) VALUES
//        (1, b'1', 'usertest@gmail.com', 'Lưu Đức Bình', '123456'),
//        (2, b'1', 'chuongghps25887@fpt.edu.vn', 'Giang Hải Chương', '123'),
//        (6, b'1', 'binhldps25658@fpt.edu.vn', 'Giang Hải Chương', '123456');
//
//        /*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
//        /*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
//        /*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
//        /*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
//        /*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
