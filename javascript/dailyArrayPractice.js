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

// 2. Palindrome
function isPalindrome(array) {
    // don't even need to check for >2 because 1/0 technically palindrome
    for (i = 0; i < array.length / 2; i++) { // halved search again for efficiency
        if (array[i] !== array[array.length - i - 1]) return false;
    }
    return true;
}

// 3. Rotate Array


// 4. Merge Sorted
function mergeSorted(array1, array2) {
    let mergedArr = [];
    let i = 0;
    let j = 0;

    while (i < array1.length && j < array2.length) {
        if (array1[i] < array2[j]) {
            mergedArr.push(array1[i]);
            i++;
        }
        else if (array1[i] > array2[j]) {
            mergedArr.push(array2[j]);
            j++;
        }
        else if (array1[i] === array2[j]) {
            mergedArr.push(array1[i]);
            mergedArr.push(array2[j]);
            i++;
            j++;
        }
    }

    while (i < array1.length) {
        mergedArr.push(array1[i]);
        i++;
    }

    while (j < array2.length) {
        mergedArr.push(array2[j]);
        j++;
    }
    return mergedArr;
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

    /*-------------Day 2: Palindrome----------------*/
    console.log(isPalindrome([1, 2, 3, 2, 1])); //true
    console.log(isPalindrome([1, 2, 3, 4]));//false
    console.log(isPalindrome([1, 1, 1, 1]));//true
    console.log(isPalindrome([1]));//true
    console.log(isPalindrome([]));//true
    console.log(isPalindrome([-1, 2, 3, 3, 2, -1]));//true
    console.log(isPalindrome([1, 2, 3, 4, 5, 3, 2, 1]));//false
    /*----------------------------------------------*/



    /*--------------Day 4: MergeSorted---------------*/
    console.log(mergeSorted([1, 3, 5], [2, 4]));
    console.log(mergeSorted([1, 2, 2, 2, 3, 4, 5, 6], [2, 2, 3, 7, 9, 10000000]));

}


testFn();