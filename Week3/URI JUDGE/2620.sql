select customers.name, orders.id
from customers, orders
where orders.orders_date < '2016-06-30' and orders.id_customers = customers.id