select movies.id, movies.name
from movies, prices
where prices.value < 2.00 and prices.id = movies.id_prices