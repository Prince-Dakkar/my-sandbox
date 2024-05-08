function classify(domain_name) {
    let return_string = domain_name;
    res = domain_name.split(".");

    switch(res[2]) {
        case "com":
            return_string += " COMPANY";
            break;
        case "edu":
            return_string += " UNIVERSITY";
            break;
        case "org":
            return_string += " ORGANIZATION";
            break;
    }

    if (domain_name.includes("money")) {
        return_string += " FINANCIAL";
    }
    if(res[1].length > 10){
        return_string += " LONG";
    }
    return return_string;
}

// rl.question('Enter the url... ', ans => {
//     console.log(classify(ans));
//     rl.close();
//   });

console.log(classify("www.companyname.com"));
console.log(classify("www.moneygram.com"));
console.log(classify("www.somecompanyandmoney.com"));
console.log(classify("www.something.io"));