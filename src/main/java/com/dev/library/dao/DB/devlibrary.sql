

INSERT INTO `category` (`id_category`, `title` , `id_user`) VALUES
(1, 'Java' ,1),
(2, 'CSS', 4),
(3, 'HTML' , 1),
(4, 'Spring' ,2),
(5, 'Git' ,3);


INSERT INTO `information` (`id_information`, `date`, `description`, `title`, `id_category`, `id_user`) VALUES
(1, '2020-04-03 00:00:00', 'visible dans la classe seulement', 'private', 1, 1),
(2, '2020-04-02 00:00:00', 'visible partout', 'public', 1, 1),
(3, '2020-04-01 00:00:00', 'tout ce qu\'on ne voit pas', '<head>', 3, 1),
(4, '2020-04-01 00:00:00', 'injection de dépendences', '@Autowired', 4, 2),
(5, '2020-04-01 00:00:00', 'cache l\'element html', 'display: none', 2, 4);

INSERT INTO `users` (`id_user`, `date_of_birth`, `email`, `username`, `password`, `phone`) VALUES
(1, '1990-08-12 00:00:00', 'anis@pop.fr', 'anis', 'anis', '666666'),
(2, '1992-04-15 00:00:00', 'abdou@pop.fr', 'abdou', 'abdou', '321456987'),
(3, '1980-04-14 00:00:00', 'thierry@pop.fr', 'thierry', 'thierry', '13216596'),
(4, '1978-04-13 00:00:00', 'seb@pop.fr', 'seb', 'seb', '6481521'),
(5, '1996-04-21 00:00:00', 'joseph@pop.fr', 'joseph', 'joseph', '0321221');

INSERT INTO `folder` (`id_folder`, `is_project`, `title`, `id_user`) VALUES
(1, b'1', 'Dev-Library(Ng)' , 1),
(2, b'1', 'Dev-Library(SpringBoot)' ,2),
(3, b'0', 'Famille' ,3),
(4, b'0', 'à réviser', 1),
(5, b'0', 'santé', 4);

INSERT INTO `task` (`id_task`, `description`, `id_folder`, `id_user`) VALUES
(1, 'appliquer le template bootstrap sur un projet Ng', 1, 1),
(2, 'récupérer les données du Back dans le Front', 1, 1),
(3, 'Faire une API REST Spring Boot', 2, 2),
(4, 'Spring Security', 4, 1),
(5, 'Séqualize et Redux', 4, 1),
(6, 'acheter medicaments', 5, 4),
(7, 'aller voir le docteur', 5, 4),
(8, 'ORM (Mapping)', 2, 2),
(9, 'des trucs à faire pour la famille', 3, 3),
(10, 'des trucs à faire pour la famille', 3, 3);






