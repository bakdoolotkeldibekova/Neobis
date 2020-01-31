select CITY, length(CITY) from STATION
order by length(CITY) desc, CITY asc
limit 1;

select CITY, length(CITY) from STATION
order by length(CITY) asc, CITY asc
limit 1;