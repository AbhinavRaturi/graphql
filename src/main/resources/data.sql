INSERT INTO public.person_info (person_id, email, first_name, last_name, phone) VALUES(1, 'Jhon@test.com', 'Jhon', 'Doe', '9939249567');
INSERT INTO public.person_info (person_id, email, first_name, last_name, phone) VALUES(2, 'Julia@test.com', 'Julia', 'Doe', '9939249567');


INSERT INTO public.order_info (order_id, person_id, order_name, order_desc, status) VALUES(1, 1, 'Pen', 'Black Pen', 'OrderDelivered');
INSERT INTO public.order_info (order_id, person_id, order_name, order_desc, status) VALUES(2, 1, 'Marker', 'Green Color Marker', 'OrderInTransit');
INSERT INTO public.order_info (order_id, person_id, order_name, order_desc, status) VALUES(3, 2, 'Purse', 'Black Color', 'OrderReturned');
