private class SendFileTask extends AsyncTask<String, Void, String> {
	
	    private String chatId;
	    private String botToken;
	
	    public SendFileTask(String chatId, String botToken) {
		        this.chatId = chatId;
		        this.botToken = botToken;
		    }
	
	    @Override
	    protected void onPreExecute() {
		        super.onPreExecute();
		    
		        Toast.makeText(MainActivity.this, "File is uploading...", Toast.LENGTH_SHORT).show();
		    }
	
	    @Override
	    protected String doInBackground(String... params) {
		        try {
			            String filePath = params[0];
			            return KoshurboiiTelegramBot.sendFileToTelegramBot(filePath, chatId, botToken);
			        }catch(Exception e){
			            e.printStackTrace();
			            return "File upload encountered an exception: " + e.getMessage();
			        }
		    }
	
	    @Override
	    protected void onPostExecute(String result) {
		       
		        Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
		    }
	
              }
