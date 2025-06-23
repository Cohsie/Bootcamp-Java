/*Use sakila;
SELECT * FROM film*/

USE sakila;

/*SELECT * FROM film WHERE length > 120;*/
/*SELECT first_name, last_name FROM customer WHERE last_name = "Smith";*/ 

/*SELECT * FROM film ORDER BY title ASC*/
/*SELECT * FROM film ORDER BY length DESC;*/

/*SELECT count(first_name) from actor*/ 

/*SELECT AVG(rental_duration) FROM film*/

/*5. Filtrar con operadores:
Encuentra todas las películas con una clasificación ( rating ) de 'PG' o 'R'.*/
/*SELECT title, rating FROM film WHERE rating = 'PG' OR rating = 'R'*/

/*Muestra los clientes con last_name que terminen en "FORD".*/
/*SELECT * FROM customer WHERE last_name = 'FORD'*/

/*6. JOIN simple:
Muestra el nombre completo de los actores y los títulos de las películas
en las que han actuado (usa las tablas actor , film_actor y film ).*/