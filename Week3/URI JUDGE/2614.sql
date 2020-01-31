select customers.name, rentals.rentals_date
from customers, rentals
where (rentals.rentals_date>='2016-09-01' AND rentals.rentals_date<='2016-09-30') and rentals.id_customers = customers.id