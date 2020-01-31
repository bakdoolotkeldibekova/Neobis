(select concat('Podium: ', team) from league limit 3) 
union all (select concat('Demoted: ', team) from league where position = (select max(position)-1 from league))
union all (select concat('Demoted: ', team) from league where position = (select max(position) from league))