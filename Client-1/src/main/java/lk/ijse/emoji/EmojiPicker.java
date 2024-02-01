package lk.ijse.emoji;

import com.vdurmont.emoji.EmojiParser;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.control.ListView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class EmojiPicker extends VBox {
    private ListView<String> emojiListView;

    public EmojiPicker() {
        // Load the emoji images
        List<String> emojis = new ArrayList<>();
        String[] emojiHtmlList = new String[]{
                "&#128514;","&#10084;","&#128525;","&#129315;","&#128522;",
                "&#128591;","&#128149;","&#128557;","&#128293;","&#128536;",
                "&#128077;","&#129392;","&#128526;","&#128518;","&#128513;",
                "&#128521;","&#129300;","&#128517;","&#128532;","&#128580;",
                "&#128540;","&#9829;","&#9851;","&#128530;","&#128553;",
                "&#9786;","&#128513;","&#128076;","&#128079;","&#128148;",
                "&#128150;","&#128153;","&#128546;","&#128170;","&#129303;",
                "&#128156;","&#128526;","&#128519;","&#127801;","&#129318;",
                "&#127881;","&#128158;","&#9996;","&#10024;","&#129335;",
                "&#128561;","&#128524;","&#127800;","&#128588;","&#128523;",
                "&#127770;","&#127773;","&#128584;","&#128585;","&#128586;",
                "&#129395;","&#127919;","&#127939;","&#127912;","&#127873;",
                "&#127897;","&#127923;","&#127942;","&#127912;","&#127874;",
                "&#127875;","&#127876;","&#127938;","&#127946;","&#127939;",
                "&#127950;","&#127951;","&#127926;","&#127929;","&#127929;",
                "&#127930;","&#127945;","&#127922;","&#127921;","&#127919;",
                "&#127920;","&#127942;","&#127942;","&#127939;","&#127916;",
                "&#127915;","&#127913;","&#127916;","&#127919;","&#127877;",
                "&#127878;","&#127879;","&#127893;","&#127896;","&#127897;",
                "&#127899;","&#127902;","&#127903;","&#127904;","&#127905;",
                "&#127907;","&#127908;","&#127909;","&#127910;","&#127912;",
                "&#127913;","&#127914;","&#127916;","&#127917;","&#127918;",
                "&#127919;","&#127920;","&#127921;","&#127922;","&#127923;",
                "&#127924;","&#127925;","&#127926;","&#127927;","&#127928;",
                "&#127929;","&#127930;","&#127931;","&#127932;","&#127933;",
                "&#127934;","&#127935;","&#127936;","&#127937;","&#127938;",
                "&#127939;","&#127940;","&#127941;","&#127942;","&#127943;",
                "&#127944;","&#127945;","&#127946;","&#127947;","&#127948;",
                "&#127949;","&#127950;","&#127951;","&#127952;","&#127953;",
                "&#127954;","&#127955;","&#127956;","&#127957;","&#127958;",
                "&#127959;","&#127960;","&#127961;","&#127962;","&#127963;",
                "&#127964;","&#127965;","&#127966;","&#127967;","&#127968;",
                "&#127969;","&#127970;","&#127971;","&#127972;","&#127973;",
                "&#127974;","&#127975;","&#127976;","&#127977;","&#127978;",
                "&#127979;","&#127980;","&#127981;","&#127982;","&#127983;",
                "&#127984;","&#127985;","&#127986;","&#127987;","&#127988;",
                "&#127989;","&#127990;","&#127991;","&#127992;","&#127993;",
                "&#127994;","&#127995;","&#127996;","&#127997;","&#127998;",
                "&#127999;","&#128000;","&#128001;","&#128002;","&#128003;",
                "&#128004;","&#128005;","&#128006;","&#128007;","&#128008;",
                "&#128009;","&#128010;","&#128011;","&#128012;","&#128013;",
                "&#128014;","&#128015;","&#128016;","&#128017;","&#128018;",
                "&#128019;","&#128020;","&#128021;","&#128022;","&#128023;",
                "&#128024;","&#128025;","&#128026;","&#128027;","&#128028;",
                "&#128029;","&#128030;","&#128031;","&#128032;","&#128033;",
                "&#128034;","&#128035;","&#128036;","&#128037;","&#128038;",
                "&#128039;","&#128040;","&#128041;","&#128042;","&#128043;",
                "&#128044;","&#128045;","&#128046;","&#128047;","&#128048;",
                "&#128049;","&#128050;","&#128051;","&#128052;","&#128053;",
                "&#128054;","&#128055;","&#128056;","&#128057;","&#128058;",
                "&#128059;","&#128060;","&#128061;","&#128062;","&#128063;",
                "&#128064;","&#128065;","&#128066;","&#128067;","&#128068;",
                "&#128069;","&#128070;","&#128071;","&#128072;","&#128073;",
                "&#128074;","&#128075;","&#128076;","&#128077;","&#128078;",
                "&#128079;","&#128080;","&#128081;","&#128082;","&#128083;",
                "&#128084;","&#128085;","&#128086;","&#128087;","&#128088;",
                "&#128089;","&#128090;","&#128091;","&#128092;","&#128093;",
                "&#128094;","&#128095;","&#128096;","&#128097;","&#128098;",
                "&#128099;","&#128100;","&#128101;","&#128102;","&#128103;",
                "&#128104;","&#128105;","&#128106;","&#128107;","&#128108;",
                "&#128109;","&#128110;","&#128111;","&#128112;","&#128113;",
                "&#128114;","&#128115;","&#128116;","&#128117;","&#128118;",
                "&#128119;","&#128120;","&#128121;","&#128122;","&#128123;",
                "&#128124;","&#128125;","&#128126;","&#128127;"
        };

        for (String em : emojiHtmlList) {
            emojis.add(EmojiParser.parseToUnicode(em));
        }

        // Create the emoji list view
        emojiListView = new ListView<>();
        emojiListView.setItems(FXCollections.observableArrayList(emojis));

        // Customize the appearance of the list view
        emojiListView.setStyle("-fx-font-size: 30px;");

        // Set the padding of the VBox
        setPadding(new Insets(10));

        // Add the ListView to the VBox
        getChildren().add(emojiListView);
    }

    public ListView<String> getEmojiListView() {
        return emojiListView;
    }
}

