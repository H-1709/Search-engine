export default function SearchBar({ onSearch }) {
  return (
    <input
      className="search-input"
      placeholder="Search documents (e.g. java)"
      onKeyDown={(e) => {
        if (e.key === "Enter") {
          onSearch(e.target.value.trim());
        }
      }}
    />
  );
}
