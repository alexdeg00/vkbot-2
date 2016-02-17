package ru.ifmo.vkbot.modules;

import ru.ifmo.vkbot.VkBot;
import ru.ifmo.vkbot.structures.Message;

/**
 *
 * @author RinesThaix
 */
public class Help extends BotModule {

    public Help(VkBot vkbot) {
        super(vkbot);
    }

    @Override
    public void handle(Message m, String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Помощь:\n");
        sb.append("- инфа [сообщение] - посчитать вероятность.\n");
        sb.append("- когда [сообщение] - узнать, когда это случится.\n");
        sb.append("- кто [сообщение] - случайный выбор человека из конфы.\n");
        sb.append("- md5 [сообщение] - посчитать md5.\n");
        sb.append("- расписание для [группа] на [день недели] - расписание пар.\n");
        sb.append("- создай мем <шаблон> [текст сверху] <текст снизу> - создать "
                + "мем на основе существующего шаблона или используя прикрепленную картинку.\n");
        sb.append("- шаблоны для мемов - показать доступные шаблоны для мемов.\n");
        sb.append("- новости - выводит новости к этому часу.\n");
        sb.append("- курс [наименование валюты] - вывести нынешний курс данной валюты к рублю.\n");
        sb.append("- найди музыку [текст] - ищет аудиозаписи, как-либо содержащие данные текст.\n");
        sb.append("- давай поговорим - отключает надобность 'Милая, ' в начале.\n");
        sb.append("- хватит разговоров - вновь включает надобность 'Милая, ' в начале.\n");
        sb.append("- создай голосование Название_голосования 1_вариант 2_вариант - создать голосование с n вариантами.\n");
        sb.append("- я голосую за [номер] - отдать свой голос за n-й вариант.\n");
        sb.append("- покажи голосование - вывести нынешние результаты голосования.\n");
        if(getVkBot().isModerator(m.getSender())) {
            
        }
        if(getVkBot().isAdministrator(m.getSender())) {
            sb.append("- [A] добавь шаблон для мемов [название]\n");
            sb.append("- [A] удали шаблон для мемов [название]\n");
            sb.append("- [A] отправь [идентификатор] [сообщение] - отправить сообщение пользователю через бота.\n");
            sb.append("- [A] добавь меня в чат [идентификатор] - добавляет вас в n-й чат бота или создает беседу с n-м юзером.\n");
            sb.append("- [A] забань [идентификатор]\n");
            sb.append("- [A] разбань [идентификатор]\n");
            sb.append("- [A] добавь модератора [идентификатор]\n");
            sb.append("- [A] удали модератора [идентификатор]\n");
            sb.append("- [A] засыпай - выключить бота.\n");
        }
        getMC().send(m.getDialog(), sb.toString());
    }

}
