package com.jian86_android.p_virtuecard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import java.util.ArrayList;

public class DescActivity extends AppCompatActivity {
    ArrayList<Vcard> vcards = new ArrayList<>(); //카드 인포arraylist
    Toolbar toolbar;
    TextView title,desc, language;
    int tsize,dsize;
    int luckNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc);
        //getSupportActionBar().hide();
        toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Intent intent =getIntent();
        luckNum = intent.getIntExtra("luckNum",0);

        title = findViewById(R.id.title);
        desc = findViewById(R.id.desc);
        language = findViewById(R.id.language);
        tsize = 38;
        dsize =18;
        mkData();

        title.setText(vcards.get(luckNum).getTitle_K());
        desc.setText(vcards.get(luckNum).getDesc_K());


    }//onCreate
    void mkData(){
        vcards.add(new Vcard(
                "감사", "Thankfulness",
                "감사는 우리가 가진 것을 고맙게 여기는 태도입니다. \n" +
                        "우리가 배우고 사랑하고 존재하는 것에 대해 고마움을 느끼는 것입니다. \n" +
                        "당신은 당신 주변과 마음속에서 매일 일어나는 작은 일에 대해서 감사 할 수 있습니다.\n" +
                        "긍정적으로 생각하세요.\n" +
                        "감사하는 마음을 갖게 되면 만족하게 됩니다.",
                "Thankfulness is being grateful for what we have.\n" +
                        "It is an attitude of gratitude for learning, loving and being.\n" +
                        "Appreciate the little things that happen around you and within you every day. \n" +
                        "Think positively. \n" +
                        "Thankfulness brings contentment."));
        vcards.add(new Vcard(
                "결의",
                "Determination",
                "결의는 어떤 일을 이룰 때까지 자신의 모든 노력을 집중하겠다고 굳게 마음먹는 것입니다. \n" +
                        "쉽지 않는 일일지라도 혼신의 힘을 다 하겠다고 다짐하는 것입니다. \n" +
                        "힘이 들거나 시련이 있어도 기필코 목표한 바를 성취하겠다는 의지가 당신에게는 있습니다.\n" +
                        "결심을 거듭 새롭게 다짐함으로써 당신의 꿈을 현실로 만들 수 있습니다.",
                "You focus your energy and efforts on a task and stick with it until it is finished.\n" +
                        "Determination is using your will power to do something when it isn't easy. \n" +
                        "You are determined to meet your goals even when it is hard or you are being tested.\n" +
                        "With determination we make our dreams come true.\n"));
        vcards.add(new Vcard(
                "겸손",
                "Humility",
                "겸손은 다른 사람을 나 자신처럼 소중히 여기는 것입니다. \n" +
                        "겸손한 사람은 주변 사람들이 무엇을 필요로 하는지 배려하고, 그들을 위해 기꺼이 봉사하려고 합니다.\n" +
                        "누구도 완전할 수 없다는 생각에서 실수는 배움의 기회로 여깁니다. \n" +
                        "무언가 훌륭한 일을 했을 때도 우쭐대는 대신 감사하는 마음을 갖습니다.\n",
                "Being humble is considering others as important as yourself. \n" +
                        "You are thoughtful of their needs and willing to be of service. \n" +
                        "You don't expect others or yourself to be perfect. \n" +
                        "You learn from your mistakes. \n" +
                        "When you do great things, humility reminds you to be thankful instead of boastful."));
        vcards.add(new Vcard(
                "관용",
                "Toerance",
                "관용은 차이를 있는 그대로 받아들이는 태도입니다. \n" +
                        "우리는 다른 사람이 우리와 똑같이 생각하고 말하고 멋내고 행동할 것을 기대하지 않습니다. \n" +
                        "우리는 편견으로부터 벗어나 모든 사람이 저마다 고유한 감정과 요구, 희망과 꿈을 지니고 있다는 사실을 이해합니다. \n" +
                        "관용은 또한 자신의 기대에 어긋나는 일이 일어나도 그를 인내심과 유연성의 미덕을 통해 받아들이는 것입니다.",
                "Being tolerant is accepting differences. \n" +
                        "You don't expect others to think, look, speak or act just like you. \n" +
                        "You are free of prejudice, knowing that all people have feelings, needs, hopes and dreams. \n" +
                        "Tolerance is also accepting things you wish were different with patience and flexibility."));
        vcards.add(new Vcard(
                "근면",
                "Diligence",
                "근면은 꾸준히 그리고 열심히 일하는 것입니다.\n" +
                        "근면한 사람은 일을 단계적으로 차근차근 해 나갈 수 있도록 주의를 기울입니다.\n" +
                        "근면은 우리가 열정을 가지고 탁월하게 일을 완수할 수 있도록 도와줍니다.\n" +
                        "근면은 우리를 성공으로 인도합니다.",
                "Diligence is working hard and doing your absolute best. \n" +
                        "You take special care by doing things step by step. \n" +
                        "Diligence helps you to get things done with excellence and enthusiasm. \n" +
                        "Diligence leads to success"));
        vcards.add(new Vcard(
                "기뻐함",
                "Joyfulness",
                "기뻐함이란 내면의 평화와 행복을 찾아 음미하는 것입니다.\n" +
                        "우리는 삶 속에서 매일 새롭게 제공되는 선물에 감사할 수 있습니다.\n" +
                        "그러한 기쁨이 없다면 우리의 행복은 일상의 재미가 사라질 때, 그와 함께 사라지게 됩니다.\n" +
                        "슬픈 일을 당했을 때도 그러한 기쁨이 있으면 우리는 그로부터 어려움을 견뎌낼 힘을 얻습니다.\n" +
                        "기쁨은 우리에게 날개를 달아줍니다.",
                "Joyfulness is an inner sense of peace and happiness. \n" +
                        "You appreciate the gifts each day brings. \n" +
                        "Without joyfulness, when the fun stops, our happiness stops. \n" +
                        "Joy can carry us through the hard times even when we are feeling very sad.\n" +
                        "Joy gives us wings."));
        vcards.add(new Vcard(
                "기지",
                "Tact",
                "기지는 진실을 말하되 상대방의 심정을 고려하여 그것을 친절하고 부드럽게 표현하는 능력입니다.\n" +
                        "기지를 발휘하면 사람들은 당신이 하고자 하는 말에 귀를 더 잘 기울이게 됩니다.\n" +
                        "말하기 전에 한 번 더 생각해 보세요. \n" +
                        "기지는 다리를 놓아 줍니다",
                "Tact is telling the truth kindly, considerate of how your words affect others' feelings. \n" +
                        "Think before you speak, knowing what is better left unsaid. \n" +
                        "When you are tactful, others find it easier to hear what you have to say. \n" +
                        "Tact builds bridges."));
        vcards.add(new Vcard(
                "끈기",
                "Perseverance",
                "끈기는 초지일관 꾸준히 나아가는 자세입니다. \n" +
                        "자신이 세운 목표에 전념하여 장애가 얼마나 크든, 시간이 얼마나 걸리든 그것을 극복해 나가는 것입니다. \n" +
                        "끈기가 있으면 포기하지 않습니다. \n" +
                        "계속해서 한 걸음씩 앞으로 내디딜 수 있습니다. \n" +
                        "당신은 폭풍우를 헤쳐 가는 배입니다. \n" +
                        "부서지지도 뱃길을 이탈하지도 않습니다. \n" +
                        "단지 파도를 탈 뿐입니다.",
                "Perseverance is being steadfast and persistent. \n" +
                        "You commit to your goals and overcome obstacles, no matter how long it takes. \n" +
                        "When you persevere, you don't give up... you keep going.\n" +
                        "Like a strong ship in a storm, you don't become battered or blown off course. \n" +
                        "You just ride the waves."));
        vcards.add(new Vcard(
                "너그러움",
                "Generosity",
                "너그러움은 베풀고 나누어 주는 것입니다. \n" +
                        "대가를 바라지 않고 주는 것입니다. \n" +
                        "당신은 사람들을 행복하게 해 줄 수 있는 방법을 찾을 수 있습니다. \n" +
                        "주는 것 자체가 당신의 기쁨이 될 수 있습니다. \n" +
                        "너그러움은 상대방에게 자신의 사랑과 우정을 보여주는 가장 좋은 방법이 될 수 있습니다.",
                "Generosity is giving and sharing. \n" +
                        "You share freely, not with the idea of receiving something in return. \n" +
                        "You find ways to give others happiness, and give just for the joy of giving. \n" +
                        "Generosity is one of the best ways to show love and friendship."));
        vcards.add(new Vcard(
                "도움",
                "Helpfulness",
                "누군가에게 도움을 준다는 것은 그들에게 봉사하고 그들의 삶이 달라질 수 있도록 사려 깊게 행동하는 것입니다. \n" +
                        "도움을 청할 때까지 기다리지 말고 당신이 먼저 도움을 주세요. \n" +
                        "도움이 필요할 땐 요청하세요. \n" +
                        "서로 도우면 우리는 많은 것을 얻게 됩니다. \n" +
                        "우리는 우리의 삶을 좀 더 편안하게 만들 수 있습니다.",
                "Helpfulness is being of service to others, doing thoughtful things that make a difference in their lives. \n" +
                        "Offer your help without waiting to be asked. \n" +
                        "Ask for help when you need it. \n" +
                        "When we help each other, we get more done. \n" +
                        "We make our lives easier.\n"));
        vcards.add(new Vcard(
                "명예",
                "Honor",
                "명예로운 삶이란 덕을 존중하는 삶을 말합니다. \n" +
                        "자신을 포함, 모든 사람을 존중하고 사회가 정한 규범을 존중한다는 뜻입니다. \n" +
                        "명예를 소중히 여기는 사람은 자신과의 약속을 지킵니다. \n" +
                        "남들이 어떻게 행동하는가에 관계없이 옳은 일을 선택합니다. \n" +
                        "명예를 소중히 여기는 것은 고결함으로 인도하는 길입니다.\n",
                "Honor is living by the virtues, showing great respect for yourself, other people, and the rules you live by. \n" +
                        "When you are honorable, you keep your word. \n" +
                        "You do the right thing regardless of what other are doing. \n" +
                        "Honor is a path of integrity."));
        vcards.add(new Vcard(
                "목적의식",
                "Purposefulness",
                "목적의식이 있다는 것은 관심의 초점이 분명하다는 것입니다. \n" +
                        "먼저 당신이 이루고자 하는 일을 머리 속에 그린 다음, 자신이 정한 목표에 집중하세요. \n" +
                        "에너지를 분산시키지 말고 한번에 하나씩 하세요. \n" +
                        "원하는 일이 일어나기를 막연히 기다리지 마세요. \n" +
                        "목적의식이 있으면 당신은 자신이 원하는 일이 일어나게 만들 수 있습니다.",
                "Being purposeful is having a clear focus. \n" +
                        "Being with a vision for what you want to accomplish, and concentrate on your goals.\n" +
                        "Do one thing at a time, without scattering your energies. \n" +
                        "Some people let things happen. \n" +
                        "When you are purposeful, you make things happen."));
        vcards.add(new Vcard(
                "믿음직함",
                "Reliability",
                "믿음직하다는 것은 무슨 일이든 믿고 맡길 수 있음을 의미합니다. \n" +
                        "자신이 한 약속을 지키고 주어진 모든 일에 최선을 다하기 때문입니다. \n" +
                        "믿음직한 사람은 책임감이 강합니다. \n" +
                        "한번 약속한 것은 잊지 않아 다시 확인할 필요가 없습니다. \n" +
                        "당신도 남들이 믿을 수 있는 사람입니다. \n" +
                        "일이 당신의 손에 맡겨졌다는 사실을 알면 사람들은 안심할 수 있습니다.",
                "Reliability means that others can depend on you. \n" +
                        "You keep your commitments and give your best to every job. \n" +
                        "You are responsible. \n" +
                        "You don't forget, and you don't need to be reminded. \n" +
                        "Other people can relax knowing things are in your reliable hands."));
        vcards.add(new Vcard(
                "배려",
                "Caring",
                "배려란 주의 사람이나 사물에 관심과 애정을 기울이는 것입니다. \n" +
                        "배려하는 마음으로 일을 하면 매사에 주의를 기울이고 최선을 다 하게 됩니다.\n" +
                        "사람들을 기꺼이 돕고 싶은 마음이 생기고, 존중하는 태도로 그들을 대하게 되며, 사물을 보다 조심스럽게 다루게 됩니다. \n" +
                        "배려는 세상을 좀 더 안전한 곳으로 만들어 줍니다.",
                "Caring is giving love and attention to people and things that matter to you. \n" +
                        "When you care about people, you help them. \n" +
                        "You do a careful job, giving your very best effort. \n" +
                        "You treat people and things gently and respectfully.\n" +
                        "Caring makes the world a safer place."));
        vcards.add(new Vcard(
                "봉사",
                "Service",
                "봉사는 내 것을 남에게 제공함으로써 그들의 삶이 풍요로워지도록 도와주는 것을 말합니다. \n" +
                        "당신은 자신이 필요로 하는 것만큼이나 다른 사람이 필요로 하는 것도 소중하게 여길 줄 압니다. \n" +
                        "사람들이 도움을 청하기 전에 먼저 그들에게 도움의 손길을 내미세요. \n" +
                        "모든 일에 최선을 다하고 탁원함을 발휘하게요. \n" +
                        "봉사의 정신으로 일을 하면, 당신을 세상을 변화시킬 수 있습니다.",
                "Service is giving to others, making a difference in their lives. \n" +
                        "You consider their needs as important as your own. \n" +
                        "Be helpful without waiting to be asked. \n" +
                        "Do every job with excellence. \n" +
                        "When you act with a spirit of service, you can change the world."));
        vcards.add(new Vcard(
                "사랑",
                "Love",
                "사랑은 가슴을 채우는 특별한 감정입니다. \n" +
                        "엷은 미소, 친절한 말 한마디, 사려 깊은 생동, 혹은 따스한 포옹을 통해 당신은 그것을 표현할 수 있습니다.\n" +
                        "그러면 사람들은 자신이 당신에게 그만큼 소중한 사람임을 느끼게 됩니다.\n" +
                        "사랑은 전염됩니다. \n" +
                        "사랑은 계속해서 퍼져 나갑니다.",
                "Love is a special feeling that fills your heart.\n" +
                        "You show love in a smile, a kind word, a thoughtful act or a hug. \n" +
                        "Love is treating people and things with care and kindness because they mean so much to you. \n" +
                        "Love is contagious."));
        vcards.add(new Vcard(
                "사려",
                "Consideration",
                "사려가 깊다는 것은 다른 사람의 감정과 그들이 처한 상황에 대해 신중하게 생각하는 것입니다. \n" +
                        "사려 깊은 사람은 항상 자신의 행동이 다른 사람에게 어떤 영향을 미칠지 염두에 둡니다. \n" +
                        "다른 사람이 무엇을 좋아하고, 무엇을 좋아하지 않는지에 대해서도 세심한 주의를 기울입니다. \n" +
                        "또 즐겨 그들을 행복하게 해 주는 일을 합니다",
                "Consideration is being thoughtful of other people and their feelings.\n" +
                        "You consider how your actions affect them. \n" +
                        "You pay careful attention to what others like and don't like, and do things that give them happiness."));
        vcards.add(new Vcard(
                "상냥함",
                "Gentleness",
                "상냥함이란 몸가짐이 신중하고, 손길은 부드러우며, 무엇을 쥘 때는 조심스럽고, 말씨가 공손하며, 생각도 사려 깊은 것을 말합니다. \n" +
                        "누군가 당신의 마음에 상처를 입히거나 당신을 화나게 할 때는 자제력을 이용하세요. \n" +
                        "같이 상처를 주는 대신 온화하게 애기하세요, \n" +
                        "당신은 세상을 좀 더 안전하고 화목한 곳으로 만들 수 있습니다.",
                "Gentleness is moving wisely, touching softly, holding carefully, speaking quietly and thinking kindly. \n" +
                        "When you feel mad or hurt, use your self-control. \n" +
                        "Instead of harming someone, talk things out peacefully. \n" +
                        "You are making the world safer, gentler place."));
        vcards.add(new Vcard(
                "소신",
                "Assertiveness",
                "소신이 있다는 것은 매사에 긍정적이고 자신감이 있다는 것을 말합니다. \n" +
                        "그것은 자신이 재능이 있는 소중한 사람임을 믿는 데서 시작됩니다. \n" +
                        "당신은 스스로 생각하고, 그것을 명료하게 표현할 수 있습니다. \n" +
                        "또 무엇이 옳고, 무엇이 옳지 않은지를 판단할 수 있습니다. \n" +
                        "당신은 존중받아 마땅한 사람입니다.",
                "Being assertive means being positive and confident. \n" +
                        "You are aware that you are a worthy person with your own special gifts. \n" +
                        "You think for yourself and express your own ideas. \n" +
                        "You know what you stand for and what you won't stand for. \n" +
                        "You expect respect"));
        vcards.add(new Vcard(
                "신뢰",
                "Trust",
                "신뢰는 안심하고 어떤 것에 의지하는 것입니다.\n" +
                        "신뢰는 삶에 대한 긍정적인 태도입니다. \n" +
                        "모든 일이 순리에 따라 올바른 방향으로 진행될 것이라고 믿는 것입니다.\n" +
                        "자신과 세상에 대한 신뢰가 있으면 설사 어려운 일이 발생해도 우리는 그 곳에서 선물을 발견하고 교훈을 알게 됩니다.",
                "Trust is having faith in someone or something. \n" +
                        "It is a positive attitude about life. \n" +
                        "You are confident that the right thing will happen without trying to control it or make it happen. \n" +
                        "Even when difficult things happen, trust helps us to find the gift or lesson in it."));
        vcards.add(new Vcard(
                "신용",
                "Trustworthiness",
                "신용은 믿고 맡길 수 있도록 행동하는 것을 말합니다.\n" +
                        "당신은 자신의 말을 지키고, 최선을 다합니다. \n" +
                        "맡은 일을 끝내기 위해 헌신적으로 일합니다. \n" +
                        "사람들이 그렇게 기대할 수 있는 것은 당신의 신용 때문입니다. \n" +
                        "당신은 하겠다고 한 일을 반드시 합니다. \n" +
                        "신용은 어떤 일에서나 성공의 열쇠입니다.",
                "Trustworthiness is being worthy of trust. \n" +
                        "People can count on you to do your best, to keep your word and to follow through on your commitments.\n" +
                        "You do what you say you will do.\n" +
                        "Trustworthiness is a key to success in anything you do."));
        vcards.add(new Vcard(
                "열정",
                "Enthusiasm",
                "열정은 우리의 정신이 즐거움과 행복과 영감으로 충만한 상태를 말합니다.\n" +
                        "어떤 일에 열정을 가질 때 우리는 그 일에 온 마음과 힘을 쏟게 됩니다. \n" +
                        "열정을 가진 사람은 긍정적입니다. \n" +
                        "열정 속에는 영감이 담겨져 있습니다.",
                "Enthusiasm is being cheerful, happy, and full of spirit.\n" +
                        "It is doing something whole heartedly and eagerly. \n" +
                        "When you are enthusiastic, you have a positive attitude. \n" +
                        "Enthusiasm is being inspired."));
        vcards.add(new Vcard(
                "예의",
                "Courtesy",
                "예의가 있다는 것은 몸가짐이 공손하다는 것입니다.\n" +
                        "누군가를 예의로 대하면 그 사람은 자신이 소중한 존재임을 느끼게 됩니다. \n" +
                        "상냥하게 인사를 하세요. 가정에서도 예의를 지키세요. \n" +
                        "가족 간에 예의를 지키는 것은 대단히 중요합니다. \n" +
                        "예의는 삶을 원활하게 해줍니다.",
                "Courtesy is being polite and having good manners. \n" +
                        "When you speak and act courteously, you give others a feeling of being valued and respected.\n" +
                        "Greet people pleasantly. \n" +
                        "Bring courtesy home. \n" +
                        "Your family needs it most of all. \n" +
                        "Courtesy helps life to go smoothly."));
        vcards.add(new Vcard(
                "용기",
                "Courage",
                "용기는 두려움 앞에 당당히 맞서는 것입니다. \n" +
                        "힘에 부치거나 무섭더라도 옳은 일을 선택하는 것입니다.\n" +
                        "용감한 사람은 쉽게 포기하지 않습니다. \n" +
                        "새로운 시도도 두려워하지 않습니다. \n" +
                        "실수는 기꺼이 인정합니다.\n" +
                        "용기는 당신의 가슴 속에 있는 힘입니다.",
                "Courage is bravery in the face of fear. \n" +
                        "You do the right thing even when it is hard or scary.\n" +
                        "When you are courageous, you don't give up. \n" +
                        "You try new things. \n" +
                        "You admit mistakes. \n" +
                        "Courage is the strength in your heart."));
        vcards.add(new Vcard(
                "용서",
                "Forgiveness",
                "용서는 누군가 자신에게 잘못을 저질렀을 때 그에게 다시 기회를 주는 것입니다. \n" +
                        "누구나 잘못을 범할 수 있습니다. \n" +
                        "보복을 하는 대신 그가 자신의 잘못에 대해 반성하고 어떠한 형태로든 용서를 구할 수 있도록 해주세요. \n" +
                        "실수에 낙담하는 대신 앞으로는 다르게 행동하겠다고 다짐하세요. \n" +
                        "변화할 수 있다는 신념을 가지세요.",
                "Being forgiveness is giving some another chance after they have done something wrong. \n" +
                        "Everyone makes mistakes.\n" +
                        "Instead of revenge, make amends.\n" +
                        "Forgive yourself too. \n" +
                        "Instead of feeling hopeless after a mistake, decide to act differently, and have faith that you can change."));
        vcards.add(new Vcard(
                "우의",
                "Friendliness",
                "우의가 있다는 것은 즐거울 때나 슬플 때나 벗이 되어주는 것을 말합니다. \n" +
                        "다른 사람에게 관심을 보이고 그들에게 편안한 느낌을 줄 대 당신은 그들의 친구가 될 수 있습니다. \n" +
                        "당신은 자신이 가진 것을 남들과 함께 나눌 수 있습니다. \n" +
                        "우의는 외로움을 치료하는 명약입니다.",
                "Friendliness is being a friend, through good times and bad. \n" +
                        "You take an interest in other people and make them feel welcome.\n" +
                        "You share your belongings, your time and yourself. \n" +
                        "Friendliness is the best cure for loneliness."));
        vcards.add(new Vcard(
                "유연성",
                "Flexibility",
                "유연성은 변화에 개방적인 태도를 말합니다. \n" +
                        "당신은 자신의 방식만을 고집하지 않으며 다른 사람의 생각과 의견을 존중합니다. \n" +
                        "유연성을 가지고 일을 추진하면 창조적인 길이 새롭게 열립니다. \n" +
                        "또 잘못된 습관을 버리고 새로운 방법을 익히게 됩니다. \n" +
                        "유연성은 우리가 보다 나은 방향으로 계속 발전하도록 도와줍니다.",
                "Flexibility is being open to change. \n" +
                        "You consider others' ideas and feelings and don't insist on your own way. \n" +
                        "Flexibility gives you creative new ways to get things done. \n" +
                        "You get rid of bad habits and learn new ones. \n" +
                        "Flexibility helps you to keep changing for the better."));
        vcards.add(new Vcard(
                "이상품기",
                "Idealism",
                "이상을 품으면 삶에서 과연 무엇이 의미 있는지, 무엇이 바른 길인지를 늘 생각하게 됩니다. \n" +
                        "이상을 지닌 사람은 자신의 신념을 따르고 삶의 의미를 음미하며 살아갑니다. \n" +
                        "과감하게 큰 꿈을 꾸고 변화를 추구하며, 그것이 가능하다는 믿음을 갖고 행동합니다.",
                "When you have ideals, you really care about what is right and meaningful in life. \n" +
                        "You follow your beliefs. \n" +
                        "You don't just accept things the way they are. \n" +
                        "You make a difference. idealists dare to have big dreams and then act as if they are possible."));
        vcards.add(new Vcard(
                "이해",
                "Understanding",
                "이해는 주어진 사물의 실체와 그 의미를 파악하기 위해 세심한 주의를 기울이는 것입니다. \n" +
                        "이해력을 기르면 놀라운 생각과 통찰력을 얻게 됩니다. \n" +
                        "이해심을 가지면 다른 사람의 입장에 공감하고 그들에게 따뜻한 마음을 갖게 됩니다. \n" +
                        "이해력은 생각하고 배우고 또 남을 배려하는데 필요한 힘입니다.",
                "Understanding is using your mind to think clearly, paying careful attention to see the meaning of things. \n" +
                        "An understanding mind gives you insights and wonderful ideas. \n" +
                        "An understanding heart gives you empathy and compassion for others. \n" +
                        "Understanding is the power to think and learn and also to care."));
        vcards.add(new Vcard(
                "인내",
                "Patience",
                "인내는 일이 제대로 잘 풀릴 것이라는 차분한 믿음이며 희망입니다. \n" +
                        "당신은 불평하지 않고 기다릴 수 있습니다. \n" +
                        "너그러운 마음으로 어려움과 시행착오를 받아들일 수 있습니다. \n" +
                        "일을 시작할 때 당신은 머리 속에서 그 끝을 그립니다. \n" +
                        "당신은 자신이 정한 목표에 다다르기 위해 꾸준히 노력할 수 있습니다. \n" +
                        "인내는 미래에 대한 헌신입니다.",
                "Patience is quiet hope and trust that things will turn out right. \n" +
                        "You wait without complaining. \n" +
                        "You are tolerant and accepting of difficulties and mistakes. \n" +
                        "You picture the end in the beginning and persevere to meet your goals. \n" +
                        "Patience is a commitment to the future."));
        vcards.add(new Vcard(
                "인정",
                "Compassion",
                "인정이 있다는 것은 누군가 상처를 입었거나 어려움에 처했을 때, \n" +
                        "설사 모르는 사람이라도 그의 아픔과 어려움을 이해하여 따뜻하게 마음을 쓰는 것입니다. \n" +
                        "비록 하소연을 들어주거나, 다정한 말 한마디 밖에 해줄 수 없다 해도 그를 도와주고 싶어 하는 마음입니다. \n" +
                        "인정이 많은 사람은 다른 사람의 실수를 용서해 줍니다. \n" +
                        "누군가 친구를 필요로 할 때는 그의 친구가 되어줍니다.",
                "Compassion is understanding and caring when someone is hurt or trouble, even if you don't know them. \n" +
                        "It is wanting to help, even if all you can do is listen and say kind words. \n" +
                        "You forgive mistakes. \n" +
                        "You are a friend when someone needs a friend."));
        vcards.add(new Vcard(
                "자율",
                "Self-Discipline",
                "자율은 자신을 감독하고 통제하는 능력을 말합니다. \n" +
                        "바람에 흔들리는 잎처럼 되지 않고, 자신이 진정으로 원하는 것을 해 나가는 것입니다. \n" +
                        "단순히 수동적으로 반응하기보다는 스스로 자신의 행동을 선택하는 것입니다. \n" +
                        "자율을 통해 당신은 일을 보다 체계적이고 효율적으로 수행할 수 있습니다.",
                "Self-Discipline means self-control. \n" +
                        "It is doing what you really want to do, rather than being tossed around by your feelings like a leaf in the wind. \n" +
                        "You act instead of react. \n" +
                        "You get things done in an orderly and efficient way. \n" +
                        "With self-discipline, you take charge of yourself"));
        vcards.add(new Vcard(
                "절도",
                "Modesty",
                "절도는 자기 자신에 대한 존중을 뜻합니다. \n" +
                        "절도 있는 사람은 자신을 소중히 여겨 몸과 마음, 일과 여가생활을 건강하게 유지합니다. \n" +
                        "또 그를 위해 자신의 생활에 일정한 선을 그음으로써 차분한 긍지를 유지합니다. \n" +
                        "절도가 있으면 다른 이들의 칭찬을 겸손하게, 그리고 감사한 마음으로 받아들일 수 있게 됩니다. \n" +
                        "그리고 스스로에게 편안함을 느끼게 됩니다.",
                "Modesty is having self-respect. \n" +
                        "When you value yourself with quiet pride, you accept praise with humility and gratitude. \n" +
                        "Modesty is being comfortable with yourself and setting healthy boundaries about your body and your privacy. "));
        vcards.add(new Vcard(
                "정돈",
                "Orderliness",
                "정돈은 주변을 조화롭고 가지런하게 유지하는 것입니다. \n" +
                        "주위가 체계적으로 정리되어 있으면 우리는 필요한 물건이 어디에 있는지 정확히 알게 됩니다. \n" +
                        "정돈되어 있으면 우리는 제자리걸음을 하는 대신 앞으로 나아갈 수 있습니다. \n" +
                        "문제는 단계적으로 풀어가세요. 내 주변의 질서가 내 내면의 질서를 만듭니다. \n" +
                        "정돈은 마음에 평화를 가져다줍니다.",
                "Orderliness is being near and living with a sense of harmony. \n" +
                        "You are organized, and you know where things are when you need them. \n" +
                        "Solve problems step by step instead of going in circles. \n" +
                        "Order around you creates order inside you.\n" +
                        "It gives you peace of mind."));
        vcards.add(new Vcard(
                "정의로움",
                "Justice",
                "정의롭다는 것은 누구든지 공정하고 공평하게 대우하는 것입니다. \n" +
                        "모든 사람이 승자가 되도록 문제를 해결하는 것입니다. \n" +
                        "당신은 선입견 없이 모든 사람을 온전한 인격체로 존중합니다. \n" +
                        "누군가 폭력을 휘두르거나 속이거나 거짓말을 하면 당신은 그것을 용납하지 않습니다. \n" +
                        "정의를 수호하기 위해서는 용기가 필요합니다. \n" +
                        "정의의 편에 서면 때로 혼자가 될 수도 있습니다.",
                "Practicing justice is being fair. \n" +
                        "It is solving problems so everyone wins. \n" +
                        "You don't prejudge. \n" +
                        "You see people as individuals. \n" +
                        "You don't accept it when someone acts like a bully, cheats or lies. \n" +
                        "Being a champion for justice takes courage. \n" +
                        "Sometime when you stand for justice, you stand alone."));
        vcards.add(new Vcard(
                "정직",
                "Honesty",
                "정직은 진실하고 진지한 태도를 말합니다. \n" +
                        "정직이 중요한 것은 그것이 신뢰를 쌓는 바탕이기 때문입니다.\n" +
                        "정직한 사람은 거짓말을 하거나 속이거나 훔치지 않을 것이라는 것을 우리는 믿을 수 있습니다. \n" +
                        "정직하다는 것은 또한 자기 자신을 있는 그대로 받아들이는 것을 의미합니다. \n" +
                        "솔직하고 믿음직한 행동을 할 때, 사람들은 당신을 믿을 수 있습니다.",
                "Honesty is being truthful and sincere. \n" +
                        "It is important because it builds trust. \n" +
                        "When people are honest, they can be relied on not to lie, cheat or steal. \n" +
                        "Being honest means that you accept yourself as you are. \n" +
                        "When you are open and trustworthy, others can believe in you."));
        vcards.add(new Vcard(
                "존중",
                "Respect",
                "존중은 무언가를 귀하게 여겨 보호해주고 지켜주는 것입니다. \n" +
                        "공손한 말과 행동으로 모든 사람을 존중해 주세요. \n" +
                        "자신이 속한 가정, 학교, 직장, 나라가 정한 규범을 존중하세요. \n" +
                        "당신 자신도 존중하세요. \n" +
                        "그러면 다른 사람들도 당신을 귀하게 여겨 존중해 줄 것입니다.",
                "We show respect by speaking and acting with courtesy. \n" +
                        "We treat others with dignity and honor the rules of our family, school and nation. \n" +
                        "Respect yourself, and others will respect you.\n"));
        vcards.add(new Vcard(
                "중용",
                "Moderation",
                "중용은 우리의 생각과 일상의 삶 속에서 건강한 균형을 이루어 나가는 것입니다. \n" +
                        "일과 놀이, 휴식과 운동, 정신적인 사람과 물질적인 삶 중에서 자신이 좋아하는 것만 한다거나 어느 한 가지에 매몰되는 일이 없이 자신의 삶과 시간을 균형 있게 관리하는 것입니다.\n",
                "Moderation is creating a healthy balance in your life between work and play, rest and exercise. \n" +
                        "You don't overdo or get swept away by the things you like. \n" +
                        "You use your self-discipline to take charge of your life and your time."));
        vcards.add(new Vcard(
                "진실함",
                "Truthfulness",
                "진실하다는 것은 말과 행동이 참되다는 것입니다. \n" +
                        "진실한 사람은 자신이 불리한 경우에도 거짓말을 하지 않습니다. \n" +
                        "험담이나 편견을 귀담아듣지 마세요.\n" +
                        "자신의 눈으로 진실을 보려고 노력하세요. \n" +
                        "다른 사람에게 잘 보이기 위해 자신을 포장하려 하지 마세요. \n" +
                        "자신의 진실한 모습을 보여주세요.",
                "Truthfulness is being honest in your words and actions. \n" +
                        "You don't tell lies even to defend yourself. \n" +
                        "Don't listen to gossip or prejudice. \n" +
                        "See the truth for yourself. \n" +
                        "Don't try to be more than you are to impress others.\n" +
                        "Be yourself, your true self."));
        vcards.add(new Vcard(
                "창의성",
                "Creativity",
                "창의성은 새로운 것을 상상하고 고안하는 힘입니다. \n" +
                        "당신이 가진 특별한 재능을 개발해 나가는 능력입니다. \n" +
                        "관찰 대상을 과감히 새로운 방식으로 보고, 문제를 해결하는 또 다른 방법을 찾아보세요. \n" +
                        "당신은 창의성을 발휘하여 이전에 없었던 새로운 것을 세상에 내 놓을 수 있습니다.",
                "Creativity is the power of imagination. \n" +
                        "It is discovering your own special talents. \n" +
                        "Dare to see things in new ways and find different ways to solve problems. \n" +
                        "With your creativity, you can bring something new into the world."));
        vcards.add(new Vcard(
                "책임감",
                "Responsibility",
                "책임감은 무슨 일이나 맡은 일을 훌륭하게 해냄으로써 다른 이들이 당신을 신뢰할 수 있게 하는 것입니다. \n" +
                        "당신은 자신의 행동에 대해 책임을 집니다. \n" +
                        "실수로 누군가에게 손해를 입혔다면 변명을 하는 대신 용서를 구하고, 그에 대해 배상을 합니다. \n" +
                        "책임감은 유능하게 대처하고 현명하게 선택하는 능력입니다.",
                "Being responsible means others can trust you to do things with excellence. \n" +
                        "You accept accountability for your actions. \n" +
                        "When you make a mistake, you offer amends instead of excuses.\n" +
                        "Responsibility is the ability to respond ably and to make smart choices."));
        vcards.add(new Vcard(
                "청결",
                "Cleanliness",
                "청결은 몸을 자주 씻고 주위를 깨끗하게 정돈하고 간수하는 것을 말합니다. \n" +
                        "우리의 몸과 마음을 건강한 것으로만 채우는 것입니다. \n" +
                        "청결을 소중히 여기면 우리는 해로운 약물로부터 우리 자신을 지킬 수 있습니다. \n" +
                        "또한 이전의 잘못을 깨끗이 털어버리고 홀가분한 마음으로 새 출발을 할 수 있습니다.",
                "Cleanliness means washing often, keeping your body clean, and wearing clean clothes. \n" +
                        "It is putting into your body and your mind only the things that keep you healthy. \n" +
                        "It is cleaning up mistakes and making a fresh start."));
        vcards.add(new Vcard(
                "초연",
                "Detachment",
                "초연은 감정의 소용돌이 속에서도 통제력을 잃지 않고 자신의 느낌을 관조하는 것을 말합니다. \n" +
                        "초연함을 유지하면 당신은 감정이 시키는 대로 행동하는 대신, 자신이 어떻게 행동할 것인지를 자유롭게 선택할 수 있게 됩니다.",
                "Detachment is experiencing your feelings without allowing your feelings to control you. \n" +
                        "Instead of just reacting, with detachment you are free to choose how you will act. \n" +
                        "You use thinking and feeling together, so you can make smart choices."));
        vcards.add(new Vcard(
                "충직",
                "Loyalty",
                "충직하다는 것은 변함없는 진실로 누군가를 대하는 것입니다. \n" +
                        "자신이 믿는 바를 흔들림 없이 지켜가는 것입니다. \n" +
                        "상황이 좋을 때나 어려울 때나 한결같은 마음으로 자신의 가족, 친구, 학교, 직장, 국가, 혹은 자신이 추구하는 이상에 신의를 지키는 것입니다. \n" +
                        "충직함을 통해 당신은 그들과 변치 않는 관계를 유지할 수 있습니다.",
                "Loyalty is staying true to someone. \n" +
                        "It is standing up for something you believe in without wavering. \n" +
                        "It is being faithful to your family, country, school, friends or ideals, when the going gets tough as well as when things are good. \n" +
                        "With loyalty, you build relationship that last forever."));
        vcards.add(new Vcard(
                "친절",
                "Kindness",
                "친절은 사람들에게 배려심을 보여주고, 뭔가 그들에게 도움이 되는 일을 하는 것입니다. \n" +
                        "사람들이 무엇을 필요로 하는지 세심하게 주의를 기울이세요. \n" +
                        "누군가 슬픔에 잠겨 있거나 당신의 도움을 필요로 하면 그를 위로해 주고 도와주세요. \n" +
                        "누군가를 놀리거나 괴롭히고 싶은 마음이 들 때는 그런 유혹을 멀리하고 오히려 그 사람을 친절하게 대하세요.",
                "Kindness is showing you care, doing some good to make life better for others. \n" +
                        "Be thoughtful about people's needs. \n" +
                        "Show love and compassion to someone who is sad or needs your help. \n" +
                        "When you are tempted to be cruel, to criticize or tease, decide to be kind instead."));
        vcards.add(new Vcard(
                "탁월함",
                "Excellence",
                "탁월함은 최선을 다하고 전력을 기울였을 때 비로소 얻어지는 것입니다.\n" +
                        "탁월함은 고귀한 목적을 향한 노력의 결정체입니다. \n" +
                        "그것은 완전성을 향한 욕구입니다. \n" +
                        "모든 씨앗의 완성이 열매이듯 당신이 가진 재능의 씨앗도 탁월함을 추구함으로써 열매를 맺게 됩니다. \n" +
                        "탁월함은 성공의 열쇠입니다.",
                "Excellence is doing your best, giving careful attention to every task and every relationship. \n" +
                        "Excellence is effort guided by a noble purpose.\n" +
                        "It is a desire for perfection. \n" +
                        "The perfection of a seed comes in the fruit. \n" +
                        "When you practice excellence, you bring your gifts to fruition. \n" +
                        "Excellence is the key to success."));
        vcards.add(new Vcard(
                "평온함",
                "Peacefulness",
                "평온함이란 내면의 평화를 말합니다. \n" +
                        "자신을 되돌아보고 감사하는 시간을 가져 보세요. \n" +
                        "모든 사람이 승자가 되는 방향으로 문제를 해결하세요. \n" +
                        "평화를 만드는 사람이 되세요. \n" +
                        "평온함이란 힘에 대한 애착을 버리고 사랑의 힘을 선택하는 것입니다. \n" +
                        "세계의 평화는 당신의 마음 속 평온함으로부터 시작됩니다.",
                "Peacefulness is being calm inside. \n" +
                        "Take time for daily reflection and gratitude. \n" +
                        "Solve conflicts so everyone wins. \n" +
                        "Be a peacemaker. \n" +
                        "Peace is giving up the love of power for the power of love. \n" +
                        "Peace in the world begins with peace in your heart."));
        vcards.add(new Vcard(
                "한결같음",
                "Integrity",
                "한결같음이란 자신에게 가장 가치 있는 것이 무엇인지 잊지 않고 그에 따라 사는 것입니다. \n" +
                        "한결같음은 우리에게 항상 정직하고 진지하기를 권합니다. \n" +
                        "그를 통해 우리는 양심의 소리에 귀 기울이고, 옳은 일을 선택하고, 언제나 진실을 말할 수 있게 됩니다. \n" +
                        "말과 행동이 일치할 때 당신은 한결같은 사람입니다. \n" +
                        "한결같음의 미덕을 통해 우리는 자긍심과 평온한 마음을 갖게 됩니다.",
                "Integrity is living by your highest values. \n" +
                        "It is being honest and sincere. \n" +
                        "Integrity helps you to listen to your conscience, to do the right thing, and to tell the truth. \n" +
                        "You act with integrity when your words and actions match. \n" +
                        "Integrity gives you self-respect and a peaceful heart. "));
        vcards.add(new Vcard(
                "헌신",
                "Commitment",
                "헌신은 자신이 가치 있다고 여기는 어떤 대상을 몸과 마음을 다해 돌보는 것입니다. \n" +
                        "헌신적인 사람은 친구, 일, 혹은 자신이 믿는 어떤 것을 위해 정성을 다합니다. \n" +
                        "헌신의 대상을 지닌 사람은 그를 위해 시작한 일을 끝냅니다. \n" +
                        "그리고 약속을 지킵니다.",
                "Commitment is caring deeply about something or someone. \n" +
                        "It is deciding carefully what you want to do, then giving it 100%, holding nothing back. \n" +
                        "You give your all to a friendship, a task, or something you believe in. \n" +
                        "You finish what you start. \n" +
                        "You keep your promises."));
        vcards.add(new Vcard(
                "협동",
                "Cooperation",
                "협동은 함께 일하고 짐을 나누어지는 것입니다. \n" +
                        "혼자서는 할 수 없는 일도 함께 하면 훌륭히 해낼 수 있습니다. \n" +
                        "우리는 우리 모두를 안전하고 행복하게 지켜주는 규칙을 기꺼이 따릅니다. \n" +
                        "힘을 합치면 우리는 큰일을 해낼 수 있습니다.",
                "Cooperation is working together and sharing them load. \n" +
                        "When we cooperate, we join with others to do things that cannot be done alone. \n" +
                        "We are willing to follow the rules which keep everyone safe and happy. \n" +
                        "Together we can accomplish great things.\n"));
        vcards.add(new Vcard(
                "확신",
                "Confidence",
                "확신은 굳은 믿음입니다. \n" +
                        "확신을 가진 사람에게는 어떤 어려움이 닥쳐도 헤쳐 나갈 힘이 있습니다. \n" +
                        "확신을 가지면 의심이나 두려움으로 주춤거리지 않습니다.\n" +
                        "자신감이 생기고, 즐거운 마음으로 새로운 일을 시도할 수 있습니다.\n",
                "Confidence is having faith in someone. \n" +
                        "Self-confidence is trusting that you have what it takes to handle whatever happens. \n" +
                        "You feel sure of yourself and enjoy trying new things, without letting doubts or fears hold you back. \n" +
                        "When you have confidence in others, you rely on them."));
        vcards.add(new Vcard(
                "화합",
                "Unity",
                "화합은 우리가 평화롭게 함께 일하고 살아갈 수 있게 도와줍니다. \n" +
                        "화합하면 우리는 서로에게, 그리고 나아가 살아 있는 모든 것에 연결되어 있음을 느낄 수 있습니다. \n" +
                        "우리는 서로의 다른 특성을 선물로 여기지  두려움이나 배척의 이유로 삼지 않습니다. \n" +
                        "화합을 통해 우리는 개개인의 힘으로 할 수 있는 것보다 훨씬 많은 것을 성취하게 됩니다.",
                "Unity helps us work and live together peacefully.\n" +
                        "We feel connected with each other and all living things. \n" +
                        "We value the specialness of each person as a gift, not as a reason to fight or be scared.\n" +
                        "With unity we accomplish more together than anyone of us could alone. "));

    }

    public void clickFont(View view) {
        tsize += 2;
        dsize += 2;
        title.setTextSize(TypedValue.COMPLEX_UNIT_SP, tsize);
        desc.setTextSize(TypedValue.COMPLEX_UNIT_SP, dsize);
    }//clickFont

    public void clickFontdel(View view) {
        tsize -= 2;
        dsize -= 2;
        title.setTextSize(TypedValue.COMPLEX_UNIT_SP, tsize);
        desc.setTextSize(TypedValue.COMPLEX_UNIT_SP, dsize);
    }//clickFontdel

    public void clickChangeLang(View view) {

        if(language.getText().equals("한국")) {
            language.setText("English");
            title.setText(vcards.get(luckNum).getTitle_K());
            desc.setText(vcards.get(luckNum).getDesc_K());
        } else {
            language.setText("한국");
            title.setText(vcards.get(luckNum).getTitle_E());
            desc.setText(vcards.get(luckNum).getDesc_E());
        }

    }//clickChangeang
}//DescActivity
