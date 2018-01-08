DELETE FROM USER_ROLES;
DELETE FROM USERS;
DELETE FROM DISHES;
DELETE FROM RESTAURANTS;

ALTER SEQUENCE global_seq RESTART WITH 1000;

INSERT INTO users (name, email, password) VALUES
  ('User', 'user@yandex.ru', 'password'),
  ('Admin', 'admin@gmail.com', 'admin');

INSERT INTO user_roles (role, user_id) VALUES
  ('ROLE_USER', 1000),
  ('ROLE_ADMIN', 1001);

INSERT INTO RESTAURANTS (NAME, DESCRIPTION, DATE) VALUES
  ('McDonalds', 'Chicken and sandwiches', '2018-01-09'),
  ('Burger King', 'Chicken and more', '2018-01-09'),
  ('McDonalds', 'Salads', '2018-01-10'),
  ('Subway', 'sandwiches', '2018-01-10');

INSERT INTO DISHES (NAME, DESCRIPTION, PRISE, REST_ID) VALUES
  ('Sweet BBQ Bacon with Buttermilk Crispy Chicken', 'Tangy, Sweet, Crispy', '8.18',1002),
  ('Classic chicken sandwich', 'McDonald’s classic chicken sandwich', '5.62',1002),
  ('Chicken cordon bleu sandwich', 'Crispy on the outside, juicy on the inside', '6.68',1003),
  ('Chicken nuggets', 'Small bites of big flavor', '7.67',1003),
  ('Bacon Ranch Grilled Chicken Salad', 'Greens with fresh flavor', '5.88',1004),
  ('Southwest Buttermilk Crispy Chicken Salad', 'Live life with zest', '6.13',1004),
  ('Italian B.M.T.', 'This all-time Italian classic is filled with Genoa salami, spicy pepperoni, and Black Forest Ham. Get it made the way you say with your favorite veggies on freshly baked bread.', '8.64',1005),
  ('Chicken & Bacon Ranch Melt', 'Stuffed with melted Monterey cheddar cheese, tender all-white meat chicken with seasoning and marinade, crispy bacon, lettuce, tomato, onions and green peppers', '9.92',1005);