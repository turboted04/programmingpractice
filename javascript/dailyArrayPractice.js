/* JavaScript translations will go in here! */

// Use Node.js for exec, research what exactly it is

// 1. Second largest
function secondMax(array) {
    if (array.length < 2) {
        return -1;
    }

    let max = -Infinity; // equivalent to Java sentinel "Integer.MIN_VALUE"
    array.forEach(value => {
        if (value > max) { max = value };
    })

    let secondMax = -Infinity;
    array.forEach(value => {
        if (value > secondMax && value !== max) { secondMax = value };
    })

    if (secondMax === -Infinity) return -1;

    return secondMax;
}



function testFn() {
    /*-------------Day 1: SecondMax-----------------*/
    const arr1 = [3, 7, 1, 9, 2]; // Style 1: declaring array then passing it in
    const arr2 = [9, 9, 7, 5];
    console.log(secondMax(arr1)); // expected 7
    console.log(secondMax(arr2)); // expected 7
    //Style 2: pass in without declaring
    console.log(secondMax(new Array(4).fill(5))); // equivalent to Java: new int[]{5, 5, 5, 5}, expected -1
    console.log(secondMax([-10, -5, -3, -1])); // can just pass array inline (i.e without declaring), same thing as Java stmt above it, expected -3
    console.log(secondMax([42])); // expected -1
    /*----------------------------------------------*/
}

testFn();