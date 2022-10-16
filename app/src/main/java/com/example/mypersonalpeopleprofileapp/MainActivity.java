package com.example.mypersonalpeopleprofileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int oldValue;

    TextView tex1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tex1 = (TextView) findViewById(R.id.Bioware);
        tex1.setTextColor(Color.WHITE);
        setContentView(R.layout.activity_main);
        tex1 = (TextView) findViewById(R.id.titleofTitle);
        tex1.setTextColor(Color.WHITE);
        tex1.setTextSize(25.3f);
        changer4bumain1();
        changer4buside1();
        changer4buside2();
        changer4buside3();
        changer4buside4();
        changer4buside5();
        changer4buside6();
        changer4buside7();
        changer4buside8();
    }
    private void changer4bumain1() {
        final TextView changingText = (TextView) findViewById(R.id.Bioware);
        final TextView changingTitle = (TextView) findViewById(R.id.titleofTitle);
        //final ImageView changeImage = (ImageView) findViewById(R.id.imageView2); will work on later
        ImageButton change_txt_main1 = (ImageButton) findViewById(R.id.imageButton14);
        change_txt_main1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changingTitle.setText("Gale- The New Era Outlaw");
                changingText.setText("Power and Equipment: Gravity manipulation and cosmic \n" +
                        "energy user. Role on team: Captain. Bio: Having memory loss of what" +
                        " seems to be years of his life, Gale finds himself in a new strange galaxy " +
                        "that seems to defy all laws of the universe that he once knew. Gale new goal is " +
                        "to understand what happened to him, find a way back home, and maybe deal with some " +
                        "misfits along that come along with him on his journey on the way.");

            }
        });
    }
    private void changer4buside1() {
        final TextView changingText = (TextView) findViewById(R.id.Bioware);
        final TextView changingTitle = (TextView) findViewById(R.id.titleofTitle);
        ImageButton change_txt_side1 = (ImageButton) findViewById(R.id.imageButton15);
        change_txt_side1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changingTitle.setText("Zazzalie- Rouge Bounty Hunter");
                changingText.setText("Power and Equipment: Quick Speed fast reflexes, " +
                        "lizard abilities, Uses a modify The Honjo Masamune.\n" +
                        "Role on team: Rouge Bounty Hunter. Instigator.\n" +
                        "Bio: Kicked out of their clan for disgracing their holy law long ago," +
                        "Zazzalie now roams the galaxy collecting bounties to pay the bills. " +
                        "When a deal with Gale sends forces her to join Neron, she may find an opportunity " +
                        "to score big.... or cause her plans to fall back in her face.");
            }
        });
    }
    private void changer4buside2() {
        final TextView changingText = (TextView) findViewById(R.id.Bioware);
        final TextView changingTitle = (TextView) findViewById(R.id.titleofTitle);
        ImageButton change_txt_side2 = (ImageButton) findViewById(R.id.imageButton16);
        change_txt_side2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changingTitle.setText("Qubilox: The Senitant Gas");
                changingText.setText("Power and Equipment: Controls Elements. Uses Skull of Blackbeard to host form. \n" +
                        "Role On Team: Guide for the team\n" +
                        "Bio: AI turned Gas sentient being," +
                        "trapped by the Head Government for experimentation. " +
                        "Now escaped and using the head of a long deceased pirate, " +
                        "it wishes to please its new family, mostly in unfortunate ways, " +
                        "as it finds its role in the universe.");
            }
        });
    }
    private void changer4buside3() {
        final TextView changingText = (TextView) findViewById(R.id.Bioware);
        final TextView changingTitle = (TextView) findViewById(R.id.titleofTitle);
        ImageButton change_txt_side3 = (ImageButton) findViewById(R.id.imageButton17);
        change_txt_side3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changingTitle.setText("Princess- The Monsterous Ruler");
                changingText.setText("Power and Equipment: Uses Alien monster to attack. Has tentacle legs.\n" +
                        "Role On Team: Royal Pain in the butt.\n" +
                        "Bio: Escaped from the heathen rebellion, princess has no choice but to plan " +
                        "for Gale to rescue her and use her to take back her rightful throne. " +
                        "She might be small and cute but she may be the scariest of the entire crew.");
            }
        });
    }
    private void changer4buside4() {
        final TextView changingText = (TextView) findViewById(R.id.Bioware);
        final TextView changingTitle = (TextView) findViewById(R.id.titleofTitle);
        ImageButton change_txt_side4 = (ImageButton) findViewById(R.id.imageButton18);
        change_txt_side4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changingTitle.setText("Flea- The Small Herb Doctor");
                changingText.setText("Power and Equipment: Healing-Support trickster, can use slingshots\n" +
                        "Role On Team: Doctor and Emotional Support Friend\n" +
                        "Bio: Apart of the Newly formed Animal Kingdom, fleas talent in smart " +
                        "talk and boldness can be a bit annoying. However, he shows his worth by " +
                        "being one of the Galaxies best medics around. He may be small, and not so " +
                        "intimidating (even though he insist that he is), but one thing is certain, " +
                        "don't doubt the Flea.\n");
            }
        });
    }
    private void changer4buside5() {
        final TextView changingText = (TextView) findViewById(R.id.Bioware);
        final TextView changingTitle = (TextView) findViewById(R.id.titleofTitle);
        ImageButton change_txt_side5 = (ImageButton) findViewById(R.id.imageButton19);
        change_txt_side5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changingTitle.setText("Fritz -A Charasmatic Pilot");
                changingText.setText("Power and Equipment: Modified dual pistols. Flying Mini Jet Drone \n" +
                        "Role On Team: Former Smuggler, Scavenger, Pilot. Father figure.\n" +
                        "Bio: Once an Earth Pilot, testing new space x time hyperspace energy, " +
                        "one mislead calculation caused for Fritz to end up in this Unknown space. " +
                        "Using his former Smuggling skills, Fritz quickly became accustomed to his new " +
                        "equipment and sets of on a path to find his way home.");
            }
        });
    }
    private void changer4buside6() {
        final TextView changingText = (TextView) findViewById(R.id.Bioware);
        final TextView changingTitle = (TextView) findViewById(R.id.titleofTitle);
        ImageButton change_txt_side6 = (ImageButton) findViewById(R.id.imageButton20);
        change_txt_side6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changingTitle.setText("Heartstone- The Lonesome Giant");
                changingText.setText("Power and Equipment: Sturdy and Rock Gollum/ Gargoyal with exposed rock heart. Gem heart is also it's mind.\n" +
                        "Role On Team: The Friendly One who is Kind of Dumb.\n" +
                        "Bio: Last of His Kind, Heartstone has spent what seemed " +
                        "like eons waiting for someone to come to his path. All he wishes " +
                        "was for someone to end his lonesome misery, but he didn't expect to go " +
                        "for another adventure along the way.");
            }
        });
    }
    private void changer4buside7() {
        final TextView changingText = (TextView) findViewById(R.id.Bioware);
        final TextView changingTitle = (TextView) findViewById(R.id.titleofTitle);
        ImageButton change_txt_side7 = (ImageButton) findViewById(R.id.imageButton21);
        change_txt_side7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changingTitle.setText("Manity- The Raging Valkyrie");
                changingText.setText("Power and Equipment: One wind with feathers, other as a metal. Used a Bat/Mace that is like a whip too.\n" +
                        "Role On Team: The Killjoy, way too serious.\n" +
                        "Bio: Apart of the Valkyrie armada, one horrendous day caused for " +
                        "Manity to lose all that she loved and cared for. Her path towards revenge " +
                        "may just cause more trouble than Neron is willing to put up with.");
            }
        });
    }
    private void changer4buside8() {
        final TextView changingText = (TextView) findViewById(R.id.Bioware);
        final TextView changingTitle = (TextView) findViewById(R.id.titleofTitle);
        ImageButton change_txt_side8 = (ImageButton) findViewById(R.id.imageButton22);
        change_txt_side8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changingTitle.setText("Syn- The Powerful");
                changingText.setText("Power and Equipment: Uses Flag that can Manipulate Aura\n" +
                        "Role On Team:  The Expert of the Outlaw Life\n" +
                        "Bio: Daughter of the Legendary Sindbad, Syn has been out in the Outcast " +
                        "life for as long as she remembers. Rivals to Gale, opportunity spreads as new " +
                        "changes in the galaxy causes Syn and Neron's path to merge. Her mysterious flag was " +
                        "said to be a gift from an old friend from one of her previous adventures.");
            }
        });
    }
}