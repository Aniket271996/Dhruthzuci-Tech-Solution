const express = require("express");
const app = express();
const PORT = 3000;
const URL = "find_symbols_in_names";

app.use(express.json());

app.post(`/${URL}`, (req, res, next) => {
  const { chemicals, symbols } = req.body;

  result = [];
  symbols.forEach((b) => {
    chemicals.forEach((a) => {
      if (a.includes(b)) {
        data = a.replace(b, `[${b}]`);
        result.push(data);
      }
    });
  });
  res.json({
      result
  });
});

app.listen(PORT, () => {
  console.log(`app started on ${PORT}`);
});

// -> install node
//  -> cd into project folder
// -> run : npm i
// -> run : npm run start
