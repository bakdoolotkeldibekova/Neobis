 select movies.id, name
from movies, genres
where description = 'Action' and genres.id = movies.id_genres