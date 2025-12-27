import { useState } from "react";
import SearchBar from "./components/SearchBar";
import Results from "./components/Results";
import "./index.css";

function App() {
  const [results, setResults] = useState([]);
  const [keyword, setKeyword] = useState("");

  const search = async (query) => {
    if (!query) return;

    setKeyword(query);

    const res = await fetch(
      `http://localhost:4567/search?q=${query}`
    );

    const data = await res.json();
    setResults(data);
  };

  return (
    <div className="container">
      <h1>Mini Search Engine</h1>
      <p className="subtitle">
        Keyword-based document search using inverted index
      </p>

      <SearchBar onSearch={search} />
      <Results results={results} keyword={keyword} />
    </div>
  );
}

export default App;
