
run the Docker Desktop

cmd => **$ cd downloads/demo**      //go to the root project  <br>
       **$ mvn clean**<br>
       **$ mvn install**<br>
       **$ docker build -f Dockerfile -t springdemo .**<br>
       **$ docker images**          //checking, was 'springdemo' repository added  =>Такая команда позволяет вывести список образов<br>
       **$ docker run -p 8080:8080 -t springdemo**<br>
                   ^<br>
                   |<br>
       Dockerfile---<br>
       Docker-compose -----<br>
                          |<br>
       **$ docker-compose up**       <br>
       Полезные команды:<br>
       **$ docker-compose down**  //Эта команда позволяет останавливать и удалять контейнеры и другие ресурсы, <br>
                                созданные командой docker-compose up.<br>
       **$ docker-compose logs -f [service name]**   //Эта команда выводит журналы сервисов<br>
       **$ docker-compose ps**   //С помощью такой команды можно вывести список контейнеров<br>
       ![dockercompose](https://hsto.org/getpro/habr/post_images/859/489/407/85948940715022ca196b8ad6f1e810d0.png)
       

          
       
