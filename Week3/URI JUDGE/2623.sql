select products.name, categories.name
from products, categories
where products.amount > 100 and ((products.id_categories between 1 and 3) or products.id_categories = 6 or products.id_categories = 9) and products.id_categories = categories.id
order by products.id_categories ASC