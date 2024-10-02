USE definitions;

CREATE TABLE IF NOT EXISTS `dashboards` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `createdAt` TIMESTAMP NOT NULL DEFAULT NOW(),
  `updatedAt` TIMESTAMP NOT NULL DEFAULT NOW() ON UPDATE NOW(),
  `title` VARCHAR(255) NOT NULL, 
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Sample data
INSERT INTO dashboards (createdAt, updatedAt, title) VALUES
(NOW(), NOW(), 'Dashboard 1'),
(NOW(), NOW(), 'Dashboard 2'),
(NOW(), NOW(), 'Dashboard 3'),
(NOW(), NOW(), 'Dashboard 4'),
(NOW(), NOW(), 'Dashboard 5');