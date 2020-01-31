SELECT categories.name, SUM(products.amount)
from products, categories
where categories.id = products.id_categories
group by categories.name