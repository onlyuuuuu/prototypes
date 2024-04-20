<!--

Permission to use, copy, modify, and/or distribute this software for any
purpose with or without fee is hereby granted.

THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR(S) DISCLAIMS ALL WARRANTIES
WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR(S) BE LIABLE FOR ANY
SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER
RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT,
NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE
USE OR PERFORMANCE OF THIS SOFTWARE.

-->
<!DOCTYPE html>
<html>
<head>
  <link rel='stylesheet' type='text/css' href='styles/main.css'>
  <title>The Learning Servlet</title>
</head>
<body>
  <h1>This page will show 10 entries as a dummy web page</h1>
  <%
    // Mimic some calculations
    int var0 = 5;
    int var1 = 5;
    int total = var0 + var1;
    for (int i = 0; i < total; i++)
    {
  %>
    <h1>Entry <%= i + 1 %></h1>
  <%
    }
  %>
</body>
</html>
