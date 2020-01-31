select products.name, providers.name
from products, providers
where providers.name = 'Ajax SA' and products.id_providers = providers.id