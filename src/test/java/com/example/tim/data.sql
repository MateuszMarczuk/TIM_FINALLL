INSERT INTO user (id, first_name, last_name, email, password) VALUES (1, 'Memory', 'Not Found', 'info@memorynotfound.com', '$2a$10$RyY4bXtV3LKkDCutlUTYDOKd2AiJYZGp4Y7MPVdLzWzT1RX.JRZyG');

INSERT INTO role (id, name) VALUES (1, 'ROLE_ADMIN');
INSERT INTO role (id, name) VALUES (2, 'ROLE_MANAGER');
INSERT INTO role (id, name) VALUES (3, 'ROLE_USER');

INSERT INTO users_roles (user_id, role_id) VALUES (1, 1);
INSERT INTO users_roles (user_id, role_id) VALUES (1, 2);

insert into event(id, title, start, end_date, description) values (1, 'event1', '2015-01-01 1:00:00', '2015-01-01 2:00:00', 'description1')
insert into event(id, title, start, end_date, description) values (2, 'event2', '2015-01-02 2:00:00', '2015-01-02 3:00:00', 'description1')
insert into event(id, title, start, end_date, description) values (3, 'event3', '2015-01-03 1:00:00', '2015-01-03 2:00:00', 'description1')
insert into event(id, title, start, end_date, description) values (4, 'event4', '2015-01-04 1:00:00', '2015-01-04 2:00:00', 'description1')