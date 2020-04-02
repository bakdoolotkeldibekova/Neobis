
run the Docker Desktop

cmd => **$ cd downloads/demo**      //go to the root project
       **$ mvn clean**
       **$ mvn install**
       **$ docker build -f Dockerfile -t springdemo .**
       **$ docker images**          //checking, was 'springdemo' repository added  =>Такая команда позволяет вывести список образов
       **$ docker run -p 8080:8080 -t springdemo**
       
                   ^
                   |
       Dockerfile---
       
       Docker-compose -----
                          |
       **$ docker-compose up**
       
       Полезные команды:
       **$ docker-compose down**  //Эта команда позволяет останавливать и удалять контейнеры и другие ресурсы, 
                                созданные командой docker-compose up.
       **$ docker-compose logs -f [service name]**   //Эта команда выводит журналы сервисов
       **$ docker-compose ps**   //С помощью такой команды можно вывести список контейнеров
       
       
       
       ![dockercompose](https://hsto.org/getpro/habr/post_images/859/489/407/85948940715022ca196b8ad6f1e810d0.png)
       

          
       
