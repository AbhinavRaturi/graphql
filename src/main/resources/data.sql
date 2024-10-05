INSERT INTO public.person_info (person_id, email, first_name, last_name, phone) VALUES(nextval('person_info_seq'), 'Jhon@test.com', 'Jhon', 'Doe', '9939249567');
INSERT INTO public.person_info (person_id, email, first_name, last_name, phone) VALUES(nextval('person_info_seq'), 'Julia@test.com', 'Julia', 'Doe', '9939249567');


INSERT INTO public.order_info (order_id, person_id, order_name, order_desc, status) VALUES(nextval('order_info_seq'), 1, 'Pen', 'Black Pen', 'ORDER_DELIVERED');
INSERT INTO public.order_info (order_id, person_id, order_name, order_desc, status) VALUES(nextval('order_info_seq'), 1, 'Marker', 'Green Color Marker', 'ORDER_IN_TRANSIT');
INSERT INTO public.order_info (order_id, person_id, order_name, order_desc, status) VALUES(nextval('order_info_seq'), 51, 'Purse', 'Black Color', 'ORDER_RETURNED');
