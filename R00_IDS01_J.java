
String s = "\uFE64" + "script" + "\uFE65";
 
// Normalize
s = Normalizer.normalize(s, Form.NFKC);
 
// Validate
Pattern pattern = Pattern.compile("[<>]");
Matcher matcher = pattern.matcher(s);
if (matcher.find()) {
  // Found blacklisted tag
  throw new IllegalStateException();
} else {
  // ...
}
