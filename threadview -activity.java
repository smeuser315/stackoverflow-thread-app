WebView webView = findViewById(R.id.webView);
webView.getSettings().setJavaScriptEnabled(true);
webView.getSettings().setLoadWithOverviewMode(true);
webView.getSettings().setUseWideViewPort(true);
webView.loadUrl("https://stackoverflow.com/questions/79714299/how-to-search-a-regular-expression-in-opensearch");
