function highlight(text, keyword) {
  if (!keyword) return text;

  const parts = text.split(
    new RegExp(`(${keyword})`, "gi")
  );

  return parts.map((part, i) =>
    part.toLowerCase() === keyword.toLowerCase() ? (
      <span key={i} className="highlight">
        {part}
      </span>
    ) : (
      part
    )
  );
}

export default function Results({ results, keyword }) {
  if (!keyword) return null;

  if (results.length === 0) {
    return <p>No documents found.</p>;
  }

  return (
    <div className="results">
      {results.map((id) => (
        <div className="card" key={id}>
          <div className="card-title">
            Document #{id}
          </div>
          <div className="card-desc">
            Keyword matched: {highlight(keyword, keyword)}
          </div>
        </div>
      ))}
    </div>
  );
}
