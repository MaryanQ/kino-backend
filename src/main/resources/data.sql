INSERT INTO moviedto (title, year, genre, director, plot, poster_url)
VALUES
    ('Interstellar', '2014', 'Adventure, Drama, Sci-Fi', 'Christopher Nolan', 'A team of explorers travel through a wormhole in space in an attempt to ensure humanity\'s survival.', 'https://musicart.xboxlive.com/7/912b1000-0000-0000-0000-000000000002/504/image.jpg?w=1920&h=1080'),
('Dune', '2021', 'Adventure, Drama, Sci-Fi', 'Denis Villeneuve', 'Feature adaptation of Frank Herbert\'s science fiction novel, about the son of a noble family entrusted with the protection of the most valuable asset and most vital element in the galaxy.', 'https://img-cdn.sfanytime.com/COVERM/COVERM_9b838abd-3933-48f6-b6ea-e522d1027711_01.jpg?w=375&ar=0.692&fit=crop&fm=pjpg&s=6f386a4c8c3232d89538b8b6a7a94bcb'),
('The Matrix Resurrections', '2021', 'Action, Sci-Fi', 'Lana Wachowski', 'Return to a world of two realities: one, everyday life; the other, what lies behind it.', 'https://i-viaplay-com.akamaized.net/viaplay-prod/476/992/1640175428-24db85e5ab11c17264c37e121d031a6a7e759985.jpg?width=400&height=600'),
('Spider-Man: No Way Home', '2021', 'Action, Adventure, Fantasy', 'Jon Watts', 'With Spider-Man\'s identity now revealed, Peter asks Doctor Strange for help. When a spell goes wrong, dangerous foes from other worlds start to appear, forcing Peter to discover what it truly means to be Spider-Man.', 'https://i-viaplay-com.akamaized.net/viaplay-prod/876/528/1646293394-34d6ddb281507dc875eb389df06bbcd450544e07.jpg?width=400&height=600'),
('Black Panther: Wakanda Forever', '2022', 'Action, Adventure, Drama', 'Ryan Coogler', 'The film will explore the world of the African kingdom of Wakanda and its people.', 'https://i-viaplay-com.akamaized.net/viaplay-prod/518/448/1673944408-30d01d596705c26b91a886ed6789150ddcf33364.jpg?width=400&height=600'),
('Avatar 2', '2022', 'Action, Adventure, Fantasy', 'James Cameron', 'A sequel to Avatar (2009).', 'https://filmhylden.dk/images/zoom/avatar2thewayofwaterdvd.jpg'),
('Jurassic World: Dominion', '2022', 'Action, Adventure, Sci-Fi', 'Colin Trevorrow', 'Plot unknown.', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTIGY7DYxqQg150CRyWYp65jXaIUMYs5M5iGUj7W04_vA&s'),
('The Batman', '2022', 'Action, Crime, Drama', 'Matt Reeves', 'The Riddler plays a deadly game of cat and mouse with Batman and Commissioner Gordon in Gotham City.', 'https://upload.wikimedia.org/wikipedia/en/thumb/f/ff/The_Batman_%28film%29_poster.jpg/220px-The_Batman_%28film%29_poster.jpg'),
('Doctor Strange in the Multiverse of Madness', '2022', 'Action, Adventure, Fantasy', 'Sam Raimi', 'Plot unknown.', 'https://lumiere-a.akamaihd.net/v1/images/p_drstrangeinthemultiverseofmadness_245_476cabb1.jpeg'),
('Sonic the Hedgehog 2', '2022', 'Action, Adventure, Comedy', 'Jeff Fowler', 'Sequel to the 2020 live-action feature film \'Sonic the Hedgehog\'.', 'https://www.flixfilm.dk/wp-content/uploads/2023/09/AAAABWC96nwER3lrbuyNJsbtmKihwWPOuvzYhbE-sfSw0nPZA1rxiIkMhCMGGXRNLxNXRqv9LJGQqsYcIrwiYjlB85Nwzq9RK1OnigY.jpg'),
('Thor: Love and Thunder', '2022', 'Action, Adventure, Fantasy', 'Taika Waititi', 'The sequel to Thor: Ragnarok and the fourth movie in the Thor saga.', 'https://imusic.b-cdn.net/images/item/original/876/8717418610876.jpg?thor-love-thunder-2022-thor-love-and-thunder-dvd&class=scaled&v=1691755675'),
('Top Gun: Maverick', '2022', 'Action, Drama', 'Joseph Kosinski', 'The plot is unknown at this time.', 'https://m.media-amazon.com/images/M/MV5BZWYzOGEwNTgtNWU3NS00ZTQ0LWJkODUtMmVhMjIwMjA1ZmQwXkEyXkFqcGdeQXVyMjkwOTAyMDU@._V1_.jpg'),
('Indiana Jones 5', '2023', 'Action, Adventure', 'James Mangold', 'The plot is unknown at this time.', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSOnvakCMlTQJl2HbbVyCJSMz9_B2t7-ucuHmGUdPcsmQ&s');

INSERT INTO movie_screeningdto (movie_title, start_time, end_time, ticket_price, available_seats, booked_seats, language)
VALUES
    ('Interstellar', '2024-03-25 13:00:00', '2024-03-25 15:30:00', 120.0, 200, 0, 'English'),
    ('Dune', '2024-03-25 16:00:00', '2024-03-25 18:30:00', 130.0, 200, 0, 'English'),
    ('The Matrix Resurrections', '2024-03-25 19:00:00', '2024-03-25 21:30:00', 140.0, 200, 0, 'English'),
    ('Spider-Man: No Way Home', '2024-03-26 13:00:00', '2024-03-26 15:30:00', 150.0, 300, 0, 'English'),
    ('Black Panther: Wakanda Forever', '2024-03-26 16:00:00', '2024-03-26 18:30:00', 160.0, 300, 0, 'English'),
    ('Avatar 2', '2024-03-27 13:00:00', '2024-03-27 15:30:00', 100.0, 400, 0, 'English'),
    ('Jurassic World: Dominion', '2024-03-27 16:00:00', '2024-03-27 18:30:00', 120.0, 200, 0, 'English'),
    ('The Batman', '2024-03-27 19:00:00', '2024-03-27 21:30:00', 130.0, 200, 0, 'English'),
    ('Doctor Strange in the Multiverse of Madness', '2024-03-28 13:00:00', '2024-03-28 15:30:00', 110.0, 400, 0, 'English'),
    ('Sonic the Hedgehog 2', '2024-03-28 16:00:00', '2024-03-28 18:30:00', 90.0, 300, 0, 'English'),
    ('Thor: Love and Thunder', '2024-03-28 19:00:00', '2024-03-28 21:30:00', 140.0, 200, 0, 'English'),
    ('Top Gun: Maverick', '2024-03-29 13:00:00', '2024-03-29 15:30:00', 130.0, 300, 0, 'English'),
    ('Indiana Jones 5', '2024-03-29 16:00:00', '2024-03-29 18:30:00', 120.0, 200, 0, 'English');

    INSERT INTO halldto (name, capacity)
VALUES
    ('Hall 1', '400'),
    ('Hall 2', '250');


INSERT INTO seatdto (type, capacity, price, movie_screeningdto_id)
VALUES ('Regular', 150, 120.00, NULL),
       ('Cowboy', 50, 160.00, NULL),
       ('Sofa', 30, 200.00, NULL);

INSERT INTO bookingdto (customer_name, seat_id, movie_id, price, booking_time)
VALUES
('John Doe', 1, 1, 150.00, '2024-03-24T10:00:00'),
('Jane Smith', 2, 2, 200.00, '2024-03-25T14:30:00'),
('Alice Johnson', 3, 1, 180.00, '2024-03-26T18:00:00');

