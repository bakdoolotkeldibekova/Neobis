select distinct movies.id, movies.name
from movies, actors, genres, movies_actors
where (actors.name = 'Marcelo Silva' or actors.name = 'Miguel Silva') and actors.id = movies_actors.id_actors and movies_actors.id_movies = movies.id and genres.description = 'Action' and genres.id = movies.id_genres