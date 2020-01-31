select life_registry.name, round(omega*1.618, 3)
from life_registry, dimensions
where life_registry.name like 'Richard%' 
and dimensions.name in ('C875', 'C774')
and dimensions.id = life_registry.dimensions_id
order by life_registry.omega asc