// Code by @koshurboii , please don't forget to give me the proper credits :)

String filePath = "YOUR_FILE_PATH";

String botToken = "YOUR_BOT_TOKEN";

String chatId = "YOUR_CHAT_ID";

// Code by @koshurboii , please don't forget to give me the proper credits :)

SendFileTask sendFileTask = new SendFileTask(chatId, botToken);
sendFileTask.execute(filePath);
