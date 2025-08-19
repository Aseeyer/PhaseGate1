// Your function takes two arguments: current father's age(years), current age of the his son(years). calculate how many years ago the father was twice as old as his son (or in how many years he will be twice as old). The answer is always greater or equal to 0, no matter if it was in the past or it is in the future.


function ageGapCalculator(currentFathersAge, currentSonAge) {
    let years = Math.abs(2 * currentSonAge - currentFathersAge);
    return years;
}

let fatherAge = 50;
let sonAge = 20;

let twice = ageGapCalculator(fatherAge, sonAge);
console.log(`The father was or will be, twice as old at ${twice} years time.`);


