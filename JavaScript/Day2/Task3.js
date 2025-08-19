/*
Implement the function which takes an array containing the names of people that like an item. it must return the display text as shown in the examples: 
[] -> "no one likes this"
["Peter"] -> "Peter likes this"
["Jacoob", ["Alex"] - "Jacoob and Alex like this"
["Max", "John", "Mark"] -> "Max, John and Mark like this"
["Alex", "Jacob", "Mark", "Max"] -> "Alex, Jacob and 2 others like this"
*/

function getLikes(names) {
    let count = names.length;

    if (count === 0) {
        return "no one likes this";
    }else if(count === 1){
        return `${names[0]} likes this`;
    }else if(count === 2){
        return `${names[0]} and ${names[1]} likes this`;
    }else if(count === 3){
        return `${names[2]}, ${names[1]} and ${names[2]} likes this`;
    }else if(count >= 4){
        return `${names[3]}, ${names[1]} and ${names.length - 2} others likes this`;
    }
}

let name = ["Emma", "Eze", "Aseeyer", "Mary", "Nwa Eze Ozo"]
console.log(getLikes(name))
