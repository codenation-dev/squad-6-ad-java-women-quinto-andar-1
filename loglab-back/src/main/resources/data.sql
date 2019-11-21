INSERT INTO usuario(id, email, password, origin)
	VALUES(1, 'paty@gamil', '1234567', '1.4.567.8'),
		(2, 'marcella@gamil', '123', '1.7.123.0'),
		(3, 'kaori@gamil', '5678', '4.0.123.0'),
		(4, 'stepani@gamil', '234', '7.5.345.7'),
		(5, 'anapaulafelic@hotmail.com', '$2a$10$js5mHwdZ7.KKMZ2QrFycJup5T7g8LQL4OTff4ArQiN50Fgx64B9bW', '1.5.315.7');
				
INSERT INTO log(id, level, title, user_id, details, created_at, frequency, filed, environment)
	VALUES(1, 'error', 'acceleratoin.dev.add', 1, 'detalhes aqui', '1509-01-08 12:02:23', 3408, false, 'dev'),
		(2, 'warning', 'codenation.dev.add', 2, 'detalhes aqui','2017-12-23 08:56:23', 9000, false, 'homologacao'),
		(3, 'debug', 'quintoAndar.dev.add', 3, 'detalhes aqui','2015-03-03 06:56:23',  200, true, 'dev'),
		(4, 'warning', 'test.dev.add', 4, 'detalhes aqui','2012-11-28 03:43:01', 3, true, 'master'),
		(5, 'debug', 'quintoAndar.dev.add', 5, 'Lorem ipsum dolor sit amet ante rhoncus.','2017-05-15 10:43:01', 200, true, 'dev');
