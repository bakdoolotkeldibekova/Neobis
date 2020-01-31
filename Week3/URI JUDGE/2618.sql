select products.name, providers.name, categories.name
from products, providers, categories
where providers.name = 'Sansul SA' and products.id_providers = providers.id and categories.name = 'Imported' and categories.id = products.id_categories