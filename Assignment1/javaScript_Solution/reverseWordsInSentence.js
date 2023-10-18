function reverseWordsInSentence(sentence) {
    // Split the sentence into words using space as the delimiter
    const words = sentence.split(" ");

    // Reverse each word and store them in an array
    const reversedWords = words.map(word => reverseWord(word));

    // Join the reversed words back into a sentence
    const reversedSentence = reversedWords.join(" ");

    return reversedSentence;
}

function reverseWord(word) {
    // Split the word into an array of characters, reverse it, and join it back
    return word.split("").reverse().join("");
}

const inputSentence = "This is a sunny day";
const reversedSentence = reverseWordsInSentence(inputSentence);

console.log(reversedSentence); // Output: "sihT si a ynnus yad"
