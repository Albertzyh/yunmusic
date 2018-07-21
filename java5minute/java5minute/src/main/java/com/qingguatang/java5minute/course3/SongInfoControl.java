package com.qingguatang.java5minute.course3;

import com.qingguatang.java5minute.course3.model.SongInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mac
 * @date 2018/5/28
 */
@Controller
public class SongInfoControl {
    @RequestMapping(value = "/songinfo")
    public String index(ModelMap modelMap){

        SongInfo songInfo = new SongInfo();
        songInfo.setName("Hello");
        songInfo.setSinger("Adele");
        songInfo.setAlbumName("Hello");
        songInfo.setCommentCount(87780);
        songInfo.setAlbumImg("http://p1.music.126.net/PrO7oPvnjvH4xdujdGbf2w==/1407374890649284.jpg?param=130y130");
        songInfo.setLyrics("Hello, it's me<br/>你好吗 是我<br/>I was wondering if after all these years you'd like to meet<br/>我犹豫着要不要给你来电 不确定多年后你是否还愿相见<br/> To go over everything<br/>愿意闲聊寒暄 细数从前<br/>They say that time's supposed to heal ya but I ain't done much healing<br/>人们都说时间能治愈一切 但我却似乎没有更好一点<br/>Hello, can you hear me<br/>嘿 你在听吗<br/>I'm in California dreaming about who we used to be<br/>我还总能想起我们过去的种种美好<br/>When we were younger and free<br/>当时那年轻而向往自由的我们<br/>I've forgotten how it felt before the world fell at our feet<br/>我都快要忘了 但现实却让一切重现眼前<br/>There's such a difference between us<br/>我们之间的差距愈见明显<br/>And a million miles<br/>有如天差地别<br/>Hello from the other side<br/>我还是想打给你 即使相隔天边<br/>I must've called a thousand times to tell you<br/>即使打上千遍万遍我也想给你来电<br/>I'm sorry, for everything that I've done<br/>对我从前所有的一切说声抱歉<br/>But when I call you never seem to be home<br/>但我每次来电 似乎都是忙音不断没人接<br/>Hello from the outside<br/>但这相隔千里的来电<br/>At least I can say that I've tried to tell you<br/>至少能让我不留遗憾地告诉你<br/>I'm sorry, for breaking your heart<br/>抱歉我曾让你心碎成片<br/>But it don't matter, it clearly doesn't tear you apart anymore<br/>但值得庆幸 不会再有人让你悲痛欲绝<br/>Hello, how are you<br/>嗨 你最近还好吗<br/>It's so typical of me to talk about myself<br/>我已经习惯了自说自话帮你回答<br/>I'm sorry, I hope that you're well<br/>也希望你现在能好过一点<br/>Did you ever make it out of that town<br/>不知你是否已忘记那小城<br/>Where nothing ever happened<br/>那不再有故事发生的小城<br/>It's no secret<br/>毫无悬念<br/>That the both of us are running out of time<br/>我们都荒废了从前的那些时间<br/>So hello from the other side<br/>所以这来自远方的我的来电<br/>I must've called a thousand times to tell you<br/>即使打上千遍万遍我也想对你说<br/>I'm sorry,<br/>对我从前<br/>for everything that I've done<br/>所有的一切说声抱歉<br/>But when I call you never seem to be home<br/>但我每次来电 似乎都是忙音不断没人<br/>Hello from the outside<br/>但这相隔千里的来电<br/>At least I can say that I've tried to tell you<br/>至少能让我不留遗憾地告诉你<br/>I'm sorry, for breaking your heart<br/>抱歉我曾让你心碎成片<br/>But it don't matter<br/>但值得庆幸<br/>it clearly doesn't tear you apart anymore<br/>不会再有人让你悲痛欲绝<br/>but it won't<br/>也不会再有<br/>anymore<br/>不会再有<br/>anymore<br/>不会再有<br/>anymore<br/>我们的从前<br/>Hello from the other side<br/>这来自远方的我的来电<br/>I must've called a thousand times<br/>即使打上千遍万遍<br/>to tell you<br/>我也想对你<br/>I'm sorry,<br/>说声抱歉<br/>for everything that I've done<br/>对我从前的一切说声抱歉<br/> But when I call you never seem to be home<br/> 但我每次来电 似乎都是忙音不断没人接<br/> Hello from the outside<br/> 但这相隔千里的来电<br/>At least I can say that I've tried<br/>至少能让我不留遗憾地<br/> to tell you<br/> 告诉你<br/> I'm sorry, for breaking your heart<br/> 抱歉我曾让你心碎成片<br/> But it don't matter<br/> 但值得庆幸<br/> it clearly doesn't tear you apart anymore<br/> 不会再有人让你悲痛欲绝");

        modelMap.addAttribute("song",songInfo);
        return "index";
    }
}
