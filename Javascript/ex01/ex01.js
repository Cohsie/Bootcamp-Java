//Ejercicio 1


//Ejercicio 3
const a = 1;
const b = 2;
let c = undefined;

function sumatorio(a, b){
    c = a + b;
    console.log(c);
};

//Ejercicio 4
let t = 1;

function esPositivo(t){
    if (t >= 0){
        console.log("El número es positivo");
    } else{
        console.log("El número es negativo")
    }
}

//Ejercicio 5
for(let i = 0; i < 10; i++){
    console.log(i);
}

let z = 0;
while (z < 10){
    z++;
}

//Ejercicio 6

const nombre = "Manolo";
function saludar(nombre){
    console.log(`Hola ${nombre}`)
}

const num1 = 3;
const num2 = 5;
function mayor(num1, num2){
    if (num1 > num2){
        console.log(`${num1} es mayor que ${num2}`)
    } else if (num2 > num1){
        console.log(`${num2} es mayor que ${num1}`)
    } else{
        console.log("Ambos números son iguales")
    }
}

//Ejercicio 7
const semana = ["Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"]
for(let i = 0; i < semana.length; i++){
    console.log(semana[i]);
}

const numeros = [1, 2, 3, 4, 5, 6]
function sumarArreglos(numeros){
    let m = 0;
    for(let j = 0; numeros.length; i++){
        m = m + numeros[j];
    }
    console.log(m);
}

//Ejercicio 8
let persona1 = ["Juan", 27, "Salamanca"];

console.log(persona1[0])
console.log(persona1[1])
console.log(persona1[2])

function describirPersona(){
    console.log(`Nombre: ${persona1[0]}, Edad: ${persona1[1]}, Ciudad: ${persona1[2]}`)
}