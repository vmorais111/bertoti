import requests
import telebot

CHATCSV_TOKEN = 'sk_3ZZV8N5EHYbt8AFU7JMTZBuh'
API_KEY = '6850944752:AAHtnvxE7udrea2oF9nesn2L_y909sSifRo'
bot = telebot.TeleBot(API_KEY)

def queryChatCsv(query):

    url="https://www.chatcsv.co/api/v1/chat"
    headers= {"Authorization": f"Bearer {CHATCSV_TOKEN}", "accept": "text/event-stream", "Content-Type": "application/json"}
    data = {
            "messages": [
                {
                    "role": "user",
                    "content": query
                }
            ],
            "files": [
                "https://raw.githubusercontent.com/mba2241/Video-Games/master/Video_Game.csv"
            ]
        }

    response = requests.post(url, json=data, headers=headers)

    if response.status_code == 200:
        print("Pedido bem-sucedido!")
        return response.text
    else:
        print(f"Erro no pedido. Código de status: {response.status_code}")
        return response.text

@bot.message_handler(func=lambda message: True)
def reply_message(message):
    # bot.reply_to(message, "Muito bem! Aguarde enquanto consulto meu banco de dados...")
    response = queryChatCsv(message.text)
    print(response)
    bot.reply_to(message, response)


print("polando o bot")
bot.polling()