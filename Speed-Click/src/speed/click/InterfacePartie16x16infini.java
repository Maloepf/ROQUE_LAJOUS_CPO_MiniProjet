/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package speed.click;

import java.awt.Color;
import java.util.Random;
import javax.swing.JButton;

/**
 *
 * @author daphn
 */
public class InterfacePartie16x16infini extends javax.swing.JFrame {

    
    Cellule [][] CellulesJeu;
    Grille grilleJeu;
    String PlayerName;
    Joueur Player;
    int Score;   
JButton [][] celluleGraphique=new JButton [16][16];


    public InterfacePartie16x16infini() {
        initComponents();
        
        
        Score = 0; //Initialisation du score en début de partit
        scorejoueur5.setText(""+Score); //Affichage du Score initiale
        
        grilleJeu= new Grille(2); //Création nouvelle grille
        
        CellulesJeu=new Cellule [2][2]; //Création nouvelles cellules
        for (int l = 0 ; l<2 ; l++){
            for(int c=0 ; c<2 ; c++){
                CellulesJeu[l][c]= new Cellule();
            }
        }
        
        
        
        celluleGraphique[0][0]=cellule00;
        celluleGraphique[0][1]=cellule01;
        celluleGraphique[0][2]=cellule02;
        celluleGraphique[0][3]=cellule03;
        celluleGraphique[0][4]=cellule04;
        celluleGraphique[0][5]=cellule05;
        celluleGraphique[0][6]=cellule06;
        celluleGraphique[0][7]=cellule07;
        celluleGraphique[0][8]=cellule08;
        celluleGraphique[0][9]=cellule09;
        celluleGraphique[0][10]=cellule010;
        celluleGraphique[0][11]=cellule011;
        celluleGraphique[0][12]=cellule012;
        celluleGraphique[0][13]=cellule013;
        celluleGraphique[0][14]=cellule014;
        celluleGraphique[0][15]=cellule015;
        
        celluleGraphique[1][0]=cellule10;
        celluleGraphique[1][1]=cellule11;
        celluleGraphique[1][2]=cellule12;
        celluleGraphique[1][3]=cellule13;
        celluleGraphique[1][4]=cellule14;
        celluleGraphique[1][5]=cellule15;
        celluleGraphique[1][6]=cellule16;
        celluleGraphique[1][7]=cellule17;
        celluleGraphique[1][8]=cellule18;
        celluleGraphique[1][9]=cellule19;
        celluleGraphique[1][10]=cellule110;
        celluleGraphique[1][11]=cellule111;
        celluleGraphique[1][12]=cellule112;
        celluleGraphique[1][13]=cellule113;
        celluleGraphique[1][14]=cellule114;
        celluleGraphique[1][15]=cellule115;
        
        
        celluleGraphique[2][0]=cellule20;
        celluleGraphique[2][1]=cellule21;
        celluleGraphique[2][2]=cellule22;
        celluleGraphique[2][3]=cellule23;
        celluleGraphique[2][4]=cellule24;
        celluleGraphique[2][5]=cellule25;
        celluleGraphique[2][6]=cellule26;
        celluleGraphique[2][7]=cellule27;
        celluleGraphique[2][8]=cellule28;
        celluleGraphique[2][9]=cellule29;
        celluleGraphique[2][10]=cellule210;
        celluleGraphique[2][11]=cellule211;
        celluleGraphique[2][12]=cellule212;
        celluleGraphique[2][13]=cellule213;
        celluleGraphique[2][14]=cellule214;
        celluleGraphique[2][15]=cellule215;
        
        
        celluleGraphique[3][0]=cellule30;
        celluleGraphique[3][1]=cellule31;
        celluleGraphique[3][2]=cellule32;
        celluleGraphique[3][3]=cellule33;
        celluleGraphique[3][4]=cellule34;
        celluleGraphique[3][5]=cellule35;
        celluleGraphique[3][6]=cellule36;
        celluleGraphique[3][7]=cellule37;
        celluleGraphique[3][8]=cellule38;
        celluleGraphique[3][9]=cellule39;
        celluleGraphique[3][10]=cellule310;
        celluleGraphique[3][11]=cellule311;
        celluleGraphique[3][12]=cellule312;
        celluleGraphique[3][13]=cellule313;
        celluleGraphique[3][14]=cellule314;
        celluleGraphique[3][15]=cellule315;
        
        
        
        celluleGraphique[4][0]=cellule40;
        celluleGraphique[4][1]=cellule41;
        celluleGraphique[4][2]=cellule42;
        celluleGraphique[4][3]=cellule43;
        celluleGraphique[4][4]=cellule44;
        celluleGraphique[4][5]=cellule45;
        celluleGraphique[4][6]=cellule46;
        celluleGraphique[4][7]=cellule47;
        celluleGraphique[4][8]=cellule48;
        celluleGraphique[4][9]=cellule49;
        celluleGraphique[4][10]=cellule410;
        celluleGraphique[4][11]=cellule411;
        celluleGraphique[4][12]=cellule412;
        celluleGraphique[4][13]=cellule413;
        celluleGraphique[4][14]=cellule414;
        celluleGraphique[4][15]=cellule415;
        
        celluleGraphique[5][0]=cellule50;
        celluleGraphique[5][1]=cellule51;
        celluleGraphique[5][2]=cellule52;
        celluleGraphique[5][3]=cellule53;
        celluleGraphique[5][4]=cellule54;
        celluleGraphique[5][5]=cellule55;
        celluleGraphique[5][6]=cellule56;
        celluleGraphique[5][7]=cellule57;
        celluleGraphique[5][8]=cellule58;
        celluleGraphique[5][9]=cellule59;
        celluleGraphique[5][10]=cellule510;
        celluleGraphique[5][11]=cellule511;
        celluleGraphique[5][12]=cellule512;
        celluleGraphique[5][13]=cellule513;
        celluleGraphique[5][14]=cellule514;
        celluleGraphique[5][15]=cellule515;
        
        celluleGraphique[6][0]=cellule60;
        celluleGraphique[6][1]=cellule61;
        celluleGraphique[6][2]=cellule62;
        celluleGraphique[6][3]=cellule63;
        celluleGraphique[6][4]=cellule64;
        celluleGraphique[6][5]=cellule65;
        celluleGraphique[6][6]=cellule66;
        celluleGraphique[6][7]=cellule67;
        celluleGraphique[6][8]=cellule68;
        celluleGraphique[6][9]=cellule69;
        celluleGraphique[6][10]=cellule610;
        celluleGraphique[6][11]=cellule611;
        celluleGraphique[6][12]=cellule612;
        celluleGraphique[6][13]=cellule613;
        celluleGraphique[6][14]=cellule614;
        celluleGraphique[6][15]=cellule615;
       
        celluleGraphique[7][0]=cellule70;
        celluleGraphique[7][1]=cellule71;
        celluleGraphique[7][2]=cellule72;
        celluleGraphique[7][3]=cellule73;
        celluleGraphique[7][4]=cellule74;
        celluleGraphique[7][5]=cellule75;
        celluleGraphique[7][6]=cellule76;
        celluleGraphique[7][7]=cellule77;
        celluleGraphique[7][8]=cellule78;
        celluleGraphique[7][9]=cellule79;
        celluleGraphique[7][10]=cellule710;
        celluleGraphique[7][11]=cellule711;
        celluleGraphique[7][12]=cellule712;
        celluleGraphique[7][13]=cellule713;
        celluleGraphique[7][14]=cellule714;
        celluleGraphique[7][15]=cellule715;
                
        celluleGraphique[8][0]=cellule80;
        celluleGraphique[8][1]=cellule81;
        celluleGraphique[8][2]=cellule82;
        celluleGraphique[8][3]=cellule83;
        celluleGraphique[8][4]=cellule84;
        celluleGraphique[8][5]=cellule85;
        celluleGraphique[8][6]=cellule86;
        celluleGraphique[8][7]=cellule87;
        celluleGraphique[8][8]=cellule88;
        celluleGraphique[8][9]=cellule89;
        celluleGraphique[8][10]=cellule810;
        celluleGraphique[8][11]=cellule811;
        celluleGraphique[8][12]=cellule812;
        celluleGraphique[8][13]=cellule813;
        celluleGraphique[8][14]=cellule814;
        celluleGraphique[8][15]=cellule815;
        
        celluleGraphique[9][0]=cellule90;
        celluleGraphique[9][1]=cellule91;
        celluleGraphique[9][2]=cellule92;
        celluleGraphique[9][3]=cellule93;
        celluleGraphique[9][4]=cellule94;
        celluleGraphique[9][5]=cellule95;
        celluleGraphique[9][6]=cellule96;
        celluleGraphique[9][7]=cellule97;
        celluleGraphique[9][8]=cellule98;
        celluleGraphique[9][9]=cellule99;
        celluleGraphique[9][10]=cellule910;
        celluleGraphique[9][11]=cellule911;
        celluleGraphique[9][12]=cellule912;
        celluleGraphique[9][13]=cellule913;
        celluleGraphique[9][14]=cellule914;
        celluleGraphique[9][15]=cellule915;
        
        celluleGraphique[10][0]=cellule10_0;
        celluleGraphique[10][1]=cellule10_1;
        celluleGraphique[10][2]=cellule10_2;
        celluleGraphique[10][3]=cellule10_3;
        celluleGraphique[10][4]=cellule10_4;
        celluleGraphique[10][5]=cellule10_5;
        celluleGraphique[10][6]=cellule10_6;
        celluleGraphique[10][7]=cellule10_7;
        celluleGraphique[10][8]=cellule10_8;
        celluleGraphique[10][9]=cellule10_9;
        celluleGraphique[10][10]=cellule10_10;
        celluleGraphique[10][11]=cellule10_11;
        celluleGraphique[10][12]=cellule10_12;
        celluleGraphique[10][13]=cellule10_13;
        celluleGraphique[10][14]=cellule10_14;
        celluleGraphique[10][15]=cellule10_15;
        
        celluleGraphique[11][0]=cellule11_0;
        celluleGraphique[11][1]=cellule11_1;
        celluleGraphique[11][2]=cellule11_2;
        celluleGraphique[11][3]=cellule11_3;
        celluleGraphique[11][4]=cellule11_4;
        celluleGraphique[11][5]=cellule11_5;
        celluleGraphique[11][6]=cellule11_6;
        celluleGraphique[11][7]=cellule11_7;
        celluleGraphique[11][8]=cellule11_8;
        celluleGraphique[11][9]=cellule11_9;
        celluleGraphique[11][10]=cellule11_10;
        celluleGraphique[11][11]=cellule11_11;
        celluleGraphique[11][12]=cellule11_12;
        celluleGraphique[11][13]=cellule11_13;
        celluleGraphique[11][14]=cellule11_14;
        celluleGraphique[11][15]=cellule11_15;
        
        celluleGraphique[12][0]=cellule12_0;
        celluleGraphique[12][1]=cellule12_1;
        celluleGraphique[12][2]=cellule12_2;
        celluleGraphique[12][3]=cellule12_3;
        celluleGraphique[12][4]=cellule12_4;
        celluleGraphique[12][5]=cellule12_5;
        celluleGraphique[12][6]=cellule12_6;
        celluleGraphique[12][7]=cellule12_7;
        celluleGraphique[12][8]=cellule12_8;
        celluleGraphique[12][9]=cellule12_9;
        celluleGraphique[12][10]=cellule12_10;
        celluleGraphique[12][11]=cellule12_11;
        celluleGraphique[12][12]=cellule12_12;
        celluleGraphique[12][13]=cellule12_13;
        celluleGraphique[12][14]=cellule12_14;
        celluleGraphique[12][15]=cellule12_15;
        
        celluleGraphique[13][0]=cellule13_0;
        celluleGraphique[13][1]=cellule13_1;
        celluleGraphique[13][2]=cellule13_2;
        celluleGraphique[13][3]=cellule13_3;
        celluleGraphique[13][4]=cellule13_4;
        celluleGraphique[13][5]=cellule13_5;
        celluleGraphique[13][6]=cellule13_6;
        celluleGraphique[13][7]=cellule13_7;
        celluleGraphique[13][8]=cellule13_8;
        celluleGraphique[13][9]=cellule13_9;
        celluleGraphique[13][10]=cellule13_10;
        celluleGraphique[13][11]=cellule13_11;
        celluleGraphique[13][12]=cellule13_12;
        celluleGraphique[13][13]=cellule13_13;
        celluleGraphique[13][14]=cellule13_14;
        celluleGraphique[13][15]=cellule13_15;
        
        celluleGraphique[14][0]=cellule14_0;
        celluleGraphique[14][1]=cellule14_1;
        celluleGraphique[14][2]=cellule14_2;
        celluleGraphique[14][3]=cellule14_3;
        celluleGraphique[14][4]=cellule14_4;
        celluleGraphique[14][5]=cellule14_5;
        celluleGraphique[14][6]=cellule14_6;
        celluleGraphique[14][7]=cellule14_7;
        celluleGraphique[14][8]=cellule14_8;
        celluleGraphique[14][9]=cellule14_9;
        celluleGraphique[14][10]=cellule14_10;
        celluleGraphique[14][11]=cellule14_11;
        celluleGraphique[14][12]=cellule14_12;
        celluleGraphique[14][13]=cellule14_13;
        celluleGraphique[14][14]=cellule14_14;
        celluleGraphique[14][15]=cellule14_15;
        
        celluleGraphique[15][0]=cellule15_0;
        celluleGraphique[15][1]=cellule15_1;
        celluleGraphique[15][2]=cellule15_2;
        celluleGraphique[15][3]=cellule15_3;
        celluleGraphique[15][4]=cellule15_4;
        celluleGraphique[15][5]=cellule15_5;
        celluleGraphique[15][6]=cellule15_6;
        celluleGraphique[15][7]=cellule15_7;
        celluleGraphique[15][8]=cellule15_8;
        celluleGraphique[15][9]=cellule15_9;
        celluleGraphique[15][10]=cellule15_10;
        celluleGraphique[15][11]=cellule15_11;
        celluleGraphique[15][12]=cellule15_12;
        celluleGraphique[15][13]=cellule15_13;
        celluleGraphique[15][14]=cellule15_14;
        celluleGraphique[15][15]=cellule15_15;
        
        
        
        allumerCelluleAleat();
        allumerCelluleAleat_graph();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panneaugrille_16x16 = new javax.swing.JPanel();
        cellule00 = new javax.swing.JButton();
        cellule01 = new javax.swing.JButton();
        cellule02 = new javax.swing.JButton();
        cellule03 = new javax.swing.JButton();
        cellule04 = new javax.swing.JButton();
        cellule05 = new javax.swing.JButton();
        cellule06 = new javax.swing.JButton();
        cellule07 = new javax.swing.JButton();
        cellule08 = new javax.swing.JButton();
        cellule09 = new javax.swing.JButton();
        cellule010 = new javax.swing.JButton();
        cellule011 = new javax.swing.JButton();
        cellule012 = new javax.swing.JButton();
        cellule013 = new javax.swing.JButton();
        cellule014 = new javax.swing.JButton();
        cellule015 = new javax.swing.JButton();
        cellule10 = new javax.swing.JButton();
        cellule11 = new javax.swing.JButton();
        cellule12 = new javax.swing.JButton();
        cellule13 = new javax.swing.JButton();
        cellule14 = new javax.swing.JButton();
        cellule15 = new javax.swing.JButton();
        cellule16 = new javax.swing.JButton();
        cellule17 = new javax.swing.JButton();
        cellule18 = new javax.swing.JButton();
        cellule19 = new javax.swing.JButton();
        cellule110 = new javax.swing.JButton();
        cellule111 = new javax.swing.JButton();
        cellule112 = new javax.swing.JButton();
        cellule113 = new javax.swing.JButton();
        cellule114 = new javax.swing.JButton();
        cellule115 = new javax.swing.JButton();
        cellule20 = new javax.swing.JButton();
        cellule21 = new javax.swing.JButton();
        cellule22 = new javax.swing.JButton();
        cellule23 = new javax.swing.JButton();
        cellule24 = new javax.swing.JButton();
        cellule25 = new javax.swing.JButton();
        cellule26 = new javax.swing.JButton();
        cellule27 = new javax.swing.JButton();
        cellule28 = new javax.swing.JButton();
        cellule29 = new javax.swing.JButton();
        cellule210 = new javax.swing.JButton();
        cellule211 = new javax.swing.JButton();
        cellule212 = new javax.swing.JButton();
        cellule213 = new javax.swing.JButton();
        cellule214 = new javax.swing.JButton();
        cellule215 = new javax.swing.JButton();
        cellule30 = new javax.swing.JButton();
        cellule31 = new javax.swing.JButton();
        cellule32 = new javax.swing.JButton();
        cellule33 = new javax.swing.JButton();
        cellule34 = new javax.swing.JButton();
        cellule35 = new javax.swing.JButton();
        cellule36 = new javax.swing.JButton();
        cellule37 = new javax.swing.JButton();
        cellule38 = new javax.swing.JButton();
        cellule39 = new javax.swing.JButton();
        cellule310 = new javax.swing.JButton();
        cellule311 = new javax.swing.JButton();
        cellule312 = new javax.swing.JButton();
        cellule313 = new javax.swing.JButton();
        cellule314 = new javax.swing.JButton();
        cellule315 = new javax.swing.JButton();
        cellule40 = new javax.swing.JButton();
        cellule41 = new javax.swing.JButton();
        cellule42 = new javax.swing.JButton();
        cellule43 = new javax.swing.JButton();
        cellule44 = new javax.swing.JButton();
        cellule45 = new javax.swing.JButton();
        cellule46 = new javax.swing.JButton();
        cellule47 = new javax.swing.JButton();
        cellule48 = new javax.swing.JButton();
        cellule49 = new javax.swing.JButton();
        cellule410 = new javax.swing.JButton();
        cellule411 = new javax.swing.JButton();
        cellule412 = new javax.swing.JButton();
        cellule413 = new javax.swing.JButton();
        cellule414 = new javax.swing.JButton();
        cellule415 = new javax.swing.JButton();
        cellule50 = new javax.swing.JButton();
        cellule51 = new javax.swing.JButton();
        cellule52 = new javax.swing.JButton();
        cellule53 = new javax.swing.JButton();
        cellule54 = new javax.swing.JButton();
        cellule55 = new javax.swing.JButton();
        cellule56 = new javax.swing.JButton();
        cellule57 = new javax.swing.JButton();
        cellule58 = new javax.swing.JButton();
        cellule59 = new javax.swing.JButton();
        cellule510 = new javax.swing.JButton();
        cellule511 = new javax.swing.JButton();
        cellule512 = new javax.swing.JButton();
        cellule513 = new javax.swing.JButton();
        cellule514 = new javax.swing.JButton();
        cellule515 = new javax.swing.JButton();
        cellule60 = new javax.swing.JButton();
        cellule61 = new javax.swing.JButton();
        cellule62 = new javax.swing.JButton();
        cellule63 = new javax.swing.JButton();
        cellule64 = new javax.swing.JButton();
        cellule65 = new javax.swing.JButton();
        cellule66 = new javax.swing.JButton();
        cellule67 = new javax.swing.JButton();
        cellule68 = new javax.swing.JButton();
        cellule69 = new javax.swing.JButton();
        cellule610 = new javax.swing.JButton();
        cellule611 = new javax.swing.JButton();
        cellule612 = new javax.swing.JButton();
        cellule613 = new javax.swing.JButton();
        cellule614 = new javax.swing.JButton();
        cellule615 = new javax.swing.JButton();
        cellule70 = new javax.swing.JButton();
        cellule71 = new javax.swing.JButton();
        cellule72 = new javax.swing.JButton();
        cellule73 = new javax.swing.JButton();
        cellule74 = new javax.swing.JButton();
        cellule75 = new javax.swing.JButton();
        cellule76 = new javax.swing.JButton();
        cellule77 = new javax.swing.JButton();
        cellule78 = new javax.swing.JButton();
        cellule79 = new javax.swing.JButton();
        cellule710 = new javax.swing.JButton();
        cellule711 = new javax.swing.JButton();
        cellule712 = new javax.swing.JButton();
        cellule713 = new javax.swing.JButton();
        cellule714 = new javax.swing.JButton();
        cellule715 = new javax.swing.JButton();
        cellule80 = new javax.swing.JButton();
        cellule81 = new javax.swing.JButton();
        cellule82 = new javax.swing.JButton();
        cellule83 = new javax.swing.JButton();
        cellule84 = new javax.swing.JButton();
        cellule85 = new javax.swing.JButton();
        cellule86 = new javax.swing.JButton();
        cellule87 = new javax.swing.JButton();
        cellule88 = new javax.swing.JButton();
        cellule89 = new javax.swing.JButton();
        cellule810 = new javax.swing.JButton();
        cellule811 = new javax.swing.JButton();
        cellule812 = new javax.swing.JButton();
        cellule813 = new javax.swing.JButton();
        cellule814 = new javax.swing.JButton();
        cellule815 = new javax.swing.JButton();
        cellule90 = new javax.swing.JButton();
        cellule91 = new javax.swing.JButton();
        cellule92 = new javax.swing.JButton();
        cellule93 = new javax.swing.JButton();
        cellule94 = new javax.swing.JButton();
        cellule95 = new javax.swing.JButton();
        cellule96 = new javax.swing.JButton();
        cellule97 = new javax.swing.JButton();
        cellule98 = new javax.swing.JButton();
        cellule99 = new javax.swing.JButton();
        cellule910 = new javax.swing.JButton();
        cellule911 = new javax.swing.JButton();
        cellule912 = new javax.swing.JButton();
        cellule913 = new javax.swing.JButton();
        cellule914 = new javax.swing.JButton();
        cellule915 = new javax.swing.JButton();
        cellule10_0 = new javax.swing.JButton();
        cellule10_1 = new javax.swing.JButton();
        cellule10_2 = new javax.swing.JButton();
        cellule10_3 = new javax.swing.JButton();
        cellule10_4 = new javax.swing.JButton();
        cellule10_5 = new javax.swing.JButton();
        cellule10_6 = new javax.swing.JButton();
        cellule10_7 = new javax.swing.JButton();
        cellule10_8 = new javax.swing.JButton();
        cellule10_9 = new javax.swing.JButton();
        cellule10_10 = new javax.swing.JButton();
        cellule10_11 = new javax.swing.JButton();
        cellule10_12 = new javax.swing.JButton();
        cellule10_13 = new javax.swing.JButton();
        cellule10_14 = new javax.swing.JButton();
        cellule10_15 = new javax.swing.JButton();
        cellule11_0 = new javax.swing.JButton();
        cellule11_1 = new javax.swing.JButton();
        cellule11_2 = new javax.swing.JButton();
        cellule11_3 = new javax.swing.JButton();
        cellule11_4 = new javax.swing.JButton();
        cellule11_5 = new javax.swing.JButton();
        cellule11_6 = new javax.swing.JButton();
        cellule11_7 = new javax.swing.JButton();
        cellule11_8 = new javax.swing.JButton();
        cellule11_9 = new javax.swing.JButton();
        cellule11_10 = new javax.swing.JButton();
        cellule11_11 = new javax.swing.JButton();
        cellule11_12 = new javax.swing.JButton();
        cellule11_13 = new javax.swing.JButton();
        cellule11_14 = new javax.swing.JButton();
        cellule11_15 = new javax.swing.JButton();
        cellule12_0 = new javax.swing.JButton();
        cellule12_1 = new javax.swing.JButton();
        cellule12_2 = new javax.swing.JButton();
        cellule12_3 = new javax.swing.JButton();
        cellule12_4 = new javax.swing.JButton();
        cellule12_5 = new javax.swing.JButton();
        cellule12_6 = new javax.swing.JButton();
        cellule12_7 = new javax.swing.JButton();
        cellule12_8 = new javax.swing.JButton();
        cellule12_9 = new javax.swing.JButton();
        cellule12_10 = new javax.swing.JButton();
        cellule12_11 = new javax.swing.JButton();
        cellule12_12 = new javax.swing.JButton();
        cellule12_13 = new javax.swing.JButton();
        cellule12_14 = new javax.swing.JButton();
        cellule12_15 = new javax.swing.JButton();
        cellule13_0 = new javax.swing.JButton();
        cellule13_1 = new javax.swing.JButton();
        cellule13_2 = new javax.swing.JButton();
        cellule13_3 = new javax.swing.JButton();
        cellule13_4 = new javax.swing.JButton();
        cellule13_5 = new javax.swing.JButton();
        cellule13_6 = new javax.swing.JButton();
        cellule13_7 = new javax.swing.JButton();
        cellule13_8 = new javax.swing.JButton();
        cellule13_9 = new javax.swing.JButton();
        cellule13_10 = new javax.swing.JButton();
        cellule13_11 = new javax.swing.JButton();
        cellule13_12 = new javax.swing.JButton();
        cellule13_13 = new javax.swing.JButton();
        cellule13_14 = new javax.swing.JButton();
        cellule13_15 = new javax.swing.JButton();
        cellule14_0 = new javax.swing.JButton();
        cellule14_1 = new javax.swing.JButton();
        cellule14_2 = new javax.swing.JButton();
        cellule14_3 = new javax.swing.JButton();
        cellule14_4 = new javax.swing.JButton();
        cellule14_5 = new javax.swing.JButton();
        cellule14_6 = new javax.swing.JButton();
        cellule14_7 = new javax.swing.JButton();
        cellule14_8 = new javax.swing.JButton();
        cellule14_9 = new javax.swing.JButton();
        cellule14_10 = new javax.swing.JButton();
        cellule14_11 = new javax.swing.JButton();
        cellule14_12 = new javax.swing.JButton();
        cellule14_13 = new javax.swing.JButton();
        cellule14_14 = new javax.swing.JButton();
        cellule14_15 = new javax.swing.JButton();
        cellule15_0 = new javax.swing.JButton();
        cellule15_1 = new javax.swing.JButton();
        cellule15_2 = new javax.swing.JButton();
        cellule15_3 = new javax.swing.JButton();
        cellule15_4 = new javax.swing.JButton();
        cellule15_5 = new javax.swing.JButton();
        cellule15_6 = new javax.swing.JButton();
        cellule15_7 = new javax.swing.JButton();
        cellule15_8 = new javax.swing.JButton();
        cellule15_9 = new javax.swing.JButton();
        cellule15_10 = new javax.swing.JButton();
        cellule15_11 = new javax.swing.JButton();
        cellule15_12 = new javax.swing.JButton();
        cellule15_13 = new javax.swing.JButton();
        cellule15_14 = new javax.swing.JButton();
        cellule15_15 = new javax.swing.JButton();
        panneaumodepartie = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        infosjoueur2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        scorejoueur5 = new javax.swing.JLabel();
        nomjoueur5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panneaugrille_16x16.setBackground(new java.awt.Color(204, 255, 255));
        Panneaugrille_16x16.setLayout(new java.awt.GridLayout(16, 16));

        cellule00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule00ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule00);

        cellule01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule01ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule01);

        cellule02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule02ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule02);

        cellule03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule03ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule03);

        cellule04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule04ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule04);

        cellule05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule05ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule05);

        cellule06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule06ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule06);

        cellule07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule07ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule07);

        cellule08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule08ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule08);

        cellule09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule09ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule09);

        cellule010.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule010ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule010);

        cellule011.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule011ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule011);
        Panneaugrille_16x16.add(cellule012);
        Panneaugrille_16x16.add(cellule013);
        Panneaugrille_16x16.add(cellule014);
        Panneaugrille_16x16.add(cellule015);
        Panneaugrille_16x16.add(cellule10);
        Panneaugrille_16x16.add(cellule11);
        Panneaugrille_16x16.add(cellule12);
        Panneaugrille_16x16.add(cellule13);
        Panneaugrille_16x16.add(cellule14);
        Panneaugrille_16x16.add(cellule15);
        Panneaugrille_16x16.add(cellule16);
        Panneaugrille_16x16.add(cellule17);
        Panneaugrille_16x16.add(cellule18);
        Panneaugrille_16x16.add(cellule19);
        Panneaugrille_16x16.add(cellule110);
        Panneaugrille_16x16.add(cellule111);
        Panneaugrille_16x16.add(cellule112);
        Panneaugrille_16x16.add(cellule113);
        Panneaugrille_16x16.add(cellule114);
        Panneaugrille_16x16.add(cellule115);
        Panneaugrille_16x16.add(cellule20);
        Panneaugrille_16x16.add(cellule21);
        Panneaugrille_16x16.add(cellule22);
        Panneaugrille_16x16.add(cellule23);
        Panneaugrille_16x16.add(cellule24);
        Panneaugrille_16x16.add(cellule25);
        Panneaugrille_16x16.add(cellule26);
        Panneaugrille_16x16.add(cellule27);
        Panneaugrille_16x16.add(cellule28);
        Panneaugrille_16x16.add(cellule29);
        Panneaugrille_16x16.add(cellule210);
        Panneaugrille_16x16.add(cellule211);
        Panneaugrille_16x16.add(cellule212);
        Panneaugrille_16x16.add(cellule213);
        Panneaugrille_16x16.add(cellule214);
        Panneaugrille_16x16.add(cellule215);
        Panneaugrille_16x16.add(cellule30);
        Panneaugrille_16x16.add(cellule31);
        Panneaugrille_16x16.add(cellule32);
        Panneaugrille_16x16.add(cellule33);
        Panneaugrille_16x16.add(cellule34);
        Panneaugrille_16x16.add(cellule35);
        Panneaugrille_16x16.add(cellule36);
        Panneaugrille_16x16.add(cellule37);
        Panneaugrille_16x16.add(cellule38);
        Panneaugrille_16x16.add(cellule39);
        Panneaugrille_16x16.add(cellule310);
        Panneaugrille_16x16.add(cellule311);
        Panneaugrille_16x16.add(cellule312);
        Panneaugrille_16x16.add(cellule313);
        Panneaugrille_16x16.add(cellule314);
        Panneaugrille_16x16.add(cellule315);
        Panneaugrille_16x16.add(cellule40);
        Panneaugrille_16x16.add(cellule41);
        Panneaugrille_16x16.add(cellule42);
        Panneaugrille_16x16.add(cellule43);
        Panneaugrille_16x16.add(cellule44);

        cellule45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule45ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule45);
        Panneaugrille_16x16.add(cellule46);
        Panneaugrille_16x16.add(cellule47);
        Panneaugrille_16x16.add(cellule48);
        Panneaugrille_16x16.add(cellule49);
        Panneaugrille_16x16.add(cellule410);
        Panneaugrille_16x16.add(cellule411);
        Panneaugrille_16x16.add(cellule412);
        Panneaugrille_16x16.add(cellule413);
        Panneaugrille_16x16.add(cellule414);
        Panneaugrille_16x16.add(cellule415);
        Panneaugrille_16x16.add(cellule50);
        Panneaugrille_16x16.add(cellule51);
        Panneaugrille_16x16.add(cellule52);
        Panneaugrille_16x16.add(cellule53);
        Panneaugrille_16x16.add(cellule54);
        Panneaugrille_16x16.add(cellule55);
        Panneaugrille_16x16.add(cellule56);
        Panneaugrille_16x16.add(cellule57);
        Panneaugrille_16x16.add(cellule58);
        Panneaugrille_16x16.add(cellule59);
        Panneaugrille_16x16.add(cellule510);
        Panneaugrille_16x16.add(cellule511);
        Panneaugrille_16x16.add(cellule512);
        Panneaugrille_16x16.add(cellule513);
        Panneaugrille_16x16.add(cellule514);
        Panneaugrille_16x16.add(cellule515);
        Panneaugrille_16x16.add(cellule60);
        Panneaugrille_16x16.add(cellule61);

        cellule62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule62ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule62);
        Panneaugrille_16x16.add(cellule63);
        Panneaugrille_16x16.add(cellule64);
        Panneaugrille_16x16.add(cellule65);
        Panneaugrille_16x16.add(cellule66);
        Panneaugrille_16x16.add(cellule67);
        Panneaugrille_16x16.add(cellule68);
        Panneaugrille_16x16.add(cellule69);
        Panneaugrille_16x16.add(cellule610);
        Panneaugrille_16x16.add(cellule611);
        Panneaugrille_16x16.add(cellule612);
        Panneaugrille_16x16.add(cellule613);
        Panneaugrille_16x16.add(cellule614);
        Panneaugrille_16x16.add(cellule615);
        Panneaugrille_16x16.add(cellule70);
        Panneaugrille_16x16.add(cellule71);
        Panneaugrille_16x16.add(cellule72);
        Panneaugrille_16x16.add(cellule73);
        Panneaugrille_16x16.add(cellule74);
        Panneaugrille_16x16.add(cellule75);
        Panneaugrille_16x16.add(cellule76);
        Panneaugrille_16x16.add(cellule77);
        Panneaugrille_16x16.add(cellule78);
        Panneaugrille_16x16.add(cellule79);
        Panneaugrille_16x16.add(cellule710);

        cellule711.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule711ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule711);
        Panneaugrille_16x16.add(cellule712);
        Panneaugrille_16x16.add(cellule713);
        Panneaugrille_16x16.add(cellule714);
        Panneaugrille_16x16.add(cellule715);
        Panneaugrille_16x16.add(cellule80);
        Panneaugrille_16x16.add(cellule81);
        Panneaugrille_16x16.add(cellule82);
        Panneaugrille_16x16.add(cellule83);
        Panneaugrille_16x16.add(cellule84);
        Panneaugrille_16x16.add(cellule85);
        Panneaugrille_16x16.add(cellule86);
        Panneaugrille_16x16.add(cellule87);
        Panneaugrille_16x16.add(cellule88);
        Panneaugrille_16x16.add(cellule89);
        Panneaugrille_16x16.add(cellule810);
        Panneaugrille_16x16.add(cellule811);
        Panneaugrille_16x16.add(cellule812);
        Panneaugrille_16x16.add(cellule813);
        Panneaugrille_16x16.add(cellule814);
        Panneaugrille_16x16.add(cellule815);
        Panneaugrille_16x16.add(cellule90);
        Panneaugrille_16x16.add(cellule91);
        Panneaugrille_16x16.add(cellule92);
        Panneaugrille_16x16.add(cellule93);
        Panneaugrille_16x16.add(cellule94);
        Panneaugrille_16x16.add(cellule95);
        Panneaugrille_16x16.add(cellule96);
        Panneaugrille_16x16.add(cellule97);
        Panneaugrille_16x16.add(cellule98);
        Panneaugrille_16x16.add(cellule99);
        Panneaugrille_16x16.add(cellule910);
        Panneaugrille_16x16.add(cellule911);
        Panneaugrille_16x16.add(cellule912);
        Panneaugrille_16x16.add(cellule913);
        Panneaugrille_16x16.add(cellule914);
        Panneaugrille_16x16.add(cellule915);
        Panneaugrille_16x16.add(cellule10_0);
        Panneaugrille_16x16.add(cellule10_1);
        Panneaugrille_16x16.add(cellule10_2);
        Panneaugrille_16x16.add(cellule10_3);
        Panneaugrille_16x16.add(cellule10_4);
        Panneaugrille_16x16.add(cellule10_5);
        Panneaugrille_16x16.add(cellule10_6);
        Panneaugrille_16x16.add(cellule10_7);
        Panneaugrille_16x16.add(cellule10_8);
        Panneaugrille_16x16.add(cellule10_9);
        Panneaugrille_16x16.add(cellule10_10);
        Panneaugrille_16x16.add(cellule10_11);
        Panneaugrille_16x16.add(cellule10_12);
        Panneaugrille_16x16.add(cellule10_13);
        Panneaugrille_16x16.add(cellule10_14);
        Panneaugrille_16x16.add(cellule10_15);
        Panneaugrille_16x16.add(cellule11_0);
        Panneaugrille_16x16.add(cellule11_1);
        Panneaugrille_16x16.add(cellule11_2);
        Panneaugrille_16x16.add(cellule11_3);
        Panneaugrille_16x16.add(cellule11_4);
        Panneaugrille_16x16.add(cellule11_5);
        Panneaugrille_16x16.add(cellule11_6);
        Panneaugrille_16x16.add(cellule11_7);
        Panneaugrille_16x16.add(cellule11_8);
        Panneaugrille_16x16.add(cellule11_9);
        Panneaugrille_16x16.add(cellule11_10);
        Panneaugrille_16x16.add(cellule11_11);
        Panneaugrille_16x16.add(cellule11_12);
        Panneaugrille_16x16.add(cellule11_13);
        Panneaugrille_16x16.add(cellule11_14);
        Panneaugrille_16x16.add(cellule11_15);
        Panneaugrille_16x16.add(cellule12_0);
        Panneaugrille_16x16.add(cellule12_1);
        Panneaugrille_16x16.add(cellule12_2);
        Panneaugrille_16x16.add(cellule12_3);
        Panneaugrille_16x16.add(cellule12_4);
        Panneaugrille_16x16.add(cellule12_5);
        Panneaugrille_16x16.add(cellule12_6);
        Panneaugrille_16x16.add(cellule12_7);
        Panneaugrille_16x16.add(cellule12_8);
        Panneaugrille_16x16.add(cellule12_9);
        Panneaugrille_16x16.add(cellule12_10);
        Panneaugrille_16x16.add(cellule12_11);
        Panneaugrille_16x16.add(cellule12_12);
        Panneaugrille_16x16.add(cellule12_13);
        Panneaugrille_16x16.add(cellule12_14);
        Panneaugrille_16x16.add(cellule12_15);
        Panneaugrille_16x16.add(cellule13_0);
        Panneaugrille_16x16.add(cellule13_1);
        Panneaugrille_16x16.add(cellule13_2);
        Panneaugrille_16x16.add(cellule13_3);
        Panneaugrille_16x16.add(cellule13_4);
        Panneaugrille_16x16.add(cellule13_5);
        Panneaugrille_16x16.add(cellule13_6);
        Panneaugrille_16x16.add(cellule13_7);
        Panneaugrille_16x16.add(cellule13_8);
        Panneaugrille_16x16.add(cellule13_9);
        Panneaugrille_16x16.add(cellule13_10);
        Panneaugrille_16x16.add(cellule13_11);
        Panneaugrille_16x16.add(cellule13_12);
        Panneaugrille_16x16.add(cellule13_13);
        Panneaugrille_16x16.add(cellule13_14);
        Panneaugrille_16x16.add(cellule13_15);
        Panneaugrille_16x16.add(cellule14_0);
        Panneaugrille_16x16.add(cellule14_1);
        Panneaugrille_16x16.add(cellule14_2);
        Panneaugrille_16x16.add(cellule14_3);
        Panneaugrille_16x16.add(cellule14_4);
        Panneaugrille_16x16.add(cellule14_5);
        Panneaugrille_16x16.add(cellule14_6);
        Panneaugrille_16x16.add(cellule14_7);
        Panneaugrille_16x16.add(cellule14_8);
        Panneaugrille_16x16.add(cellule14_9);
        Panneaugrille_16x16.add(cellule14_10);
        Panneaugrille_16x16.add(cellule14_11);
        Panneaugrille_16x16.add(cellule14_12);
        Panneaugrille_16x16.add(cellule14_13);
        Panneaugrille_16x16.add(cellule14_14);
        Panneaugrille_16x16.add(cellule14_15);
        Panneaugrille_16x16.add(cellule15_0);
        Panneaugrille_16x16.add(cellule15_1);
        Panneaugrille_16x16.add(cellule15_2);
        Panneaugrille_16x16.add(cellule15_3);
        Panneaugrille_16x16.add(cellule15_4);
        Panneaugrille_16x16.add(cellule15_5);
        Panneaugrille_16x16.add(cellule15_6);
        Panneaugrille_16x16.add(cellule15_7);
        Panneaugrille_16x16.add(cellule15_8);
        Panneaugrille_16x16.add(cellule15_9);
        Panneaugrille_16x16.add(cellule15_10);
        Panneaugrille_16x16.add(cellule15_11);
        Panneaugrille_16x16.add(cellule15_12);
        Panneaugrille_16x16.add(cellule15_13);
        Panneaugrille_16x16.add(cellule15_14);
        Panneaugrille_16x16.add(cellule15_15);

        getContentPane().add(Panneaugrille_16x16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 700, 700));

        panneaumodepartie.setBackground(new java.awt.Color(255, 153, 255));
        panneaumodepartie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setText("Bienvenue dans la Partie 16x16 infini !");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        panneaumodepartie.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 307, 48));

        getContentPane().add(panneaumodepartie, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, 380, -1));

        infosjoueur2.setBackground(new java.awt.Color(255, 255, 204));
        infosjoueur2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Infos Joueurs : ");
        infosjoueur2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 20));

        scorejoueur5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        scorejoueur5.setText("scorejoueur5");
        infosjoueur2.add(scorejoueur5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 80, 20));

        nomjoueur5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nomjoueur5.setText("nomjoueur5");
        infosjoueur2.add(nomjoueur5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 80, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Score : ");
        infosjoueur2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 20));
        infosjoueur2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 270, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nom : ");
        infosjoueur2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, 20));

        getContentPane().add(infosjoueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 250, 310, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void cellule02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule02ActionPerformed
if (CellulesJeu[0][2].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(0,2);
            celluleGraphique[0][2].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule02ActionPerformed

    private void cellule45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cellule45ActionPerformed

    private void cellule62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule62ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cellule62ActionPerformed

    private void cellule711ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule711ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cellule711ActionPerformed

    private void cellule00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule00ActionPerformed
if (CellulesJeu[0][0].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(0,0);
            celluleGraphique[0][0].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule00ActionPerformed

    private void cellule01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule01ActionPerformed
if (CellulesJeu[0][1].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(0,1);
            celluleGraphique[0][1].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule01ActionPerformed

    private void cellule03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule03ActionPerformed
if (CellulesJeu[0][3].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(0,3);
            celluleGraphique[0][3].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule03ActionPerformed

    private void cellule04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule04ActionPerformed
if (CellulesJeu[0][4].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(0,4);
            celluleGraphique[0][4].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule04ActionPerformed

    private void cellule05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule05ActionPerformed
if (CellulesJeu[0][5].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(0,5);
            celluleGraphique[0][5].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule05ActionPerformed

    private void cellule06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule06ActionPerformed
if (CellulesJeu[0][6].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(0,6);
            celluleGraphique[0][6].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule06ActionPerformed

    private void cellule07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule07ActionPerformed
if (CellulesJeu[0][7].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(0,7);
            celluleGraphique[0][7].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule07ActionPerformed

    private void cellule08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule08ActionPerformed
if (CellulesJeu[0][8].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(0,8);
            celluleGraphique[0][8].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule08ActionPerformed

    private void cellule09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule09ActionPerformed
if (CellulesJeu[0][9].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(0,9);
            celluleGraphique[0][9].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule09ActionPerformed

    private void cellule010ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule010ActionPerformed
if (CellulesJeu[0][10].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(0,10);
            celluleGraphique[0][10].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule010ActionPerformed

    private void cellule011ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule011ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cellule011ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfacePartie16x16infini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfacePartie16x16infini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfacePartie16x16infini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfacePartie16x16infini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfacePartie16x16infini().setVisible(true);
            }
        });
    }
    
    
       
       public void allumerCelluleAleat() {
        allumerCellule(new Random().nextInt(2),new Random().nextInt(2)); 
    }
    
    
    public void allumerCelluleAleat_graph(){
        for (int l =0; l<2; l++){
            for (int c = 0; c<2; c++){
                if (CellulesJeu[c][l].EstAllume){ 
                    celluleGraphique[c][l].setBackground(Color.RED);
                }
            }
        }
    }
    
    public void allumerCellule (int x, int y){
        CellulesJeu[x][y].allumer();
    }
    
    public void eteindreCellule (int x, int y){
        CellulesJeu[x][y].eteindre();
    }
    
    public void AssimilationNom(){
        Player= new Joueur(PlayerName);
        System.out.println(PlayerName);
        nomjoueur5.setText(PlayerName);
   }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panneaugrille_16x16;
    private javax.swing.JButton cellule00;
    private javax.swing.JButton cellule01;
    private javax.swing.JButton cellule010;
    private javax.swing.JButton cellule011;
    private javax.swing.JButton cellule012;
    private javax.swing.JButton cellule013;
    private javax.swing.JButton cellule014;
    private javax.swing.JButton cellule015;
    private javax.swing.JButton cellule02;
    private javax.swing.JButton cellule03;
    private javax.swing.JButton cellule04;
    private javax.swing.JButton cellule05;
    private javax.swing.JButton cellule06;
    private javax.swing.JButton cellule07;
    private javax.swing.JButton cellule08;
    private javax.swing.JButton cellule09;
    private javax.swing.JButton cellule10;
    private javax.swing.JButton cellule10_0;
    private javax.swing.JButton cellule10_1;
    private javax.swing.JButton cellule10_10;
    private javax.swing.JButton cellule10_11;
    private javax.swing.JButton cellule10_12;
    private javax.swing.JButton cellule10_13;
    private javax.swing.JButton cellule10_14;
    private javax.swing.JButton cellule10_15;
    private javax.swing.JButton cellule10_2;
    private javax.swing.JButton cellule10_3;
    private javax.swing.JButton cellule10_4;
    private javax.swing.JButton cellule10_5;
    private javax.swing.JButton cellule10_6;
    private javax.swing.JButton cellule10_7;
    private javax.swing.JButton cellule10_8;
    private javax.swing.JButton cellule10_9;
    private javax.swing.JButton cellule11;
    private javax.swing.JButton cellule110;
    private javax.swing.JButton cellule111;
    private javax.swing.JButton cellule112;
    private javax.swing.JButton cellule113;
    private javax.swing.JButton cellule114;
    private javax.swing.JButton cellule115;
    private javax.swing.JButton cellule11_0;
    private javax.swing.JButton cellule11_1;
    private javax.swing.JButton cellule11_10;
    private javax.swing.JButton cellule11_11;
    private javax.swing.JButton cellule11_12;
    private javax.swing.JButton cellule11_13;
    private javax.swing.JButton cellule11_14;
    private javax.swing.JButton cellule11_15;
    private javax.swing.JButton cellule11_2;
    private javax.swing.JButton cellule11_3;
    private javax.swing.JButton cellule11_4;
    private javax.swing.JButton cellule11_5;
    private javax.swing.JButton cellule11_6;
    private javax.swing.JButton cellule11_7;
    private javax.swing.JButton cellule11_8;
    private javax.swing.JButton cellule11_9;
    private javax.swing.JButton cellule12;
    private javax.swing.JButton cellule12_0;
    private javax.swing.JButton cellule12_1;
    private javax.swing.JButton cellule12_10;
    private javax.swing.JButton cellule12_11;
    private javax.swing.JButton cellule12_12;
    private javax.swing.JButton cellule12_13;
    private javax.swing.JButton cellule12_14;
    private javax.swing.JButton cellule12_15;
    private javax.swing.JButton cellule12_2;
    private javax.swing.JButton cellule12_3;
    private javax.swing.JButton cellule12_4;
    private javax.swing.JButton cellule12_5;
    private javax.swing.JButton cellule12_6;
    private javax.swing.JButton cellule12_7;
    private javax.swing.JButton cellule12_8;
    private javax.swing.JButton cellule12_9;
    private javax.swing.JButton cellule13;
    private javax.swing.JButton cellule13_0;
    private javax.swing.JButton cellule13_1;
    private javax.swing.JButton cellule13_10;
    private javax.swing.JButton cellule13_11;
    private javax.swing.JButton cellule13_12;
    private javax.swing.JButton cellule13_13;
    private javax.swing.JButton cellule13_14;
    private javax.swing.JButton cellule13_15;
    private javax.swing.JButton cellule13_2;
    private javax.swing.JButton cellule13_3;
    private javax.swing.JButton cellule13_4;
    private javax.swing.JButton cellule13_5;
    private javax.swing.JButton cellule13_6;
    private javax.swing.JButton cellule13_7;
    private javax.swing.JButton cellule13_8;
    private javax.swing.JButton cellule13_9;
    private javax.swing.JButton cellule14;
    private javax.swing.JButton cellule14_0;
    private javax.swing.JButton cellule14_1;
    private javax.swing.JButton cellule14_10;
    private javax.swing.JButton cellule14_11;
    private javax.swing.JButton cellule14_12;
    private javax.swing.JButton cellule14_13;
    private javax.swing.JButton cellule14_14;
    private javax.swing.JButton cellule14_15;
    private javax.swing.JButton cellule14_2;
    private javax.swing.JButton cellule14_3;
    private javax.swing.JButton cellule14_4;
    private javax.swing.JButton cellule14_5;
    private javax.swing.JButton cellule14_6;
    private javax.swing.JButton cellule14_7;
    private javax.swing.JButton cellule14_8;
    private javax.swing.JButton cellule14_9;
    private javax.swing.JButton cellule15;
    private javax.swing.JButton cellule15_0;
    private javax.swing.JButton cellule15_1;
    private javax.swing.JButton cellule15_10;
    private javax.swing.JButton cellule15_11;
    private javax.swing.JButton cellule15_12;
    private javax.swing.JButton cellule15_13;
    private javax.swing.JButton cellule15_14;
    private javax.swing.JButton cellule15_15;
    private javax.swing.JButton cellule15_2;
    private javax.swing.JButton cellule15_3;
    private javax.swing.JButton cellule15_4;
    private javax.swing.JButton cellule15_5;
    private javax.swing.JButton cellule15_6;
    private javax.swing.JButton cellule15_7;
    private javax.swing.JButton cellule15_8;
    private javax.swing.JButton cellule15_9;
    private javax.swing.JButton cellule16;
    private javax.swing.JButton cellule17;
    private javax.swing.JButton cellule18;
    private javax.swing.JButton cellule19;
    private javax.swing.JButton cellule20;
    private javax.swing.JButton cellule21;
    private javax.swing.JButton cellule210;
    private javax.swing.JButton cellule211;
    private javax.swing.JButton cellule212;
    private javax.swing.JButton cellule213;
    private javax.swing.JButton cellule214;
    private javax.swing.JButton cellule215;
    private javax.swing.JButton cellule22;
    private javax.swing.JButton cellule23;
    private javax.swing.JButton cellule24;
    private javax.swing.JButton cellule25;
    private javax.swing.JButton cellule26;
    private javax.swing.JButton cellule27;
    private javax.swing.JButton cellule28;
    private javax.swing.JButton cellule29;
    private javax.swing.JButton cellule30;
    private javax.swing.JButton cellule31;
    private javax.swing.JButton cellule310;
    private javax.swing.JButton cellule311;
    private javax.swing.JButton cellule312;
    private javax.swing.JButton cellule313;
    private javax.swing.JButton cellule314;
    private javax.swing.JButton cellule315;
    private javax.swing.JButton cellule32;
    private javax.swing.JButton cellule33;
    private javax.swing.JButton cellule34;
    private javax.swing.JButton cellule35;
    private javax.swing.JButton cellule36;
    private javax.swing.JButton cellule37;
    private javax.swing.JButton cellule38;
    private javax.swing.JButton cellule39;
    private javax.swing.JButton cellule40;
    private javax.swing.JButton cellule41;
    private javax.swing.JButton cellule410;
    private javax.swing.JButton cellule411;
    private javax.swing.JButton cellule412;
    private javax.swing.JButton cellule413;
    private javax.swing.JButton cellule414;
    private javax.swing.JButton cellule415;
    private javax.swing.JButton cellule42;
    private javax.swing.JButton cellule43;
    private javax.swing.JButton cellule44;
    private javax.swing.JButton cellule45;
    private javax.swing.JButton cellule46;
    private javax.swing.JButton cellule47;
    private javax.swing.JButton cellule48;
    private javax.swing.JButton cellule49;
    private javax.swing.JButton cellule50;
    private javax.swing.JButton cellule51;
    private javax.swing.JButton cellule510;
    private javax.swing.JButton cellule511;
    private javax.swing.JButton cellule512;
    private javax.swing.JButton cellule513;
    private javax.swing.JButton cellule514;
    private javax.swing.JButton cellule515;
    private javax.swing.JButton cellule52;
    private javax.swing.JButton cellule53;
    private javax.swing.JButton cellule54;
    private javax.swing.JButton cellule55;
    private javax.swing.JButton cellule56;
    private javax.swing.JButton cellule57;
    private javax.swing.JButton cellule58;
    private javax.swing.JButton cellule59;
    private javax.swing.JButton cellule60;
    private javax.swing.JButton cellule61;
    private javax.swing.JButton cellule610;
    private javax.swing.JButton cellule611;
    private javax.swing.JButton cellule612;
    private javax.swing.JButton cellule613;
    private javax.swing.JButton cellule614;
    private javax.swing.JButton cellule615;
    private javax.swing.JButton cellule62;
    private javax.swing.JButton cellule63;
    private javax.swing.JButton cellule64;
    private javax.swing.JButton cellule65;
    private javax.swing.JButton cellule66;
    private javax.swing.JButton cellule67;
    private javax.swing.JButton cellule68;
    private javax.swing.JButton cellule69;
    private javax.swing.JButton cellule70;
    private javax.swing.JButton cellule71;
    private javax.swing.JButton cellule710;
    private javax.swing.JButton cellule711;
    private javax.swing.JButton cellule712;
    private javax.swing.JButton cellule713;
    private javax.swing.JButton cellule714;
    private javax.swing.JButton cellule715;
    private javax.swing.JButton cellule72;
    private javax.swing.JButton cellule73;
    private javax.swing.JButton cellule74;
    private javax.swing.JButton cellule75;
    private javax.swing.JButton cellule76;
    private javax.swing.JButton cellule77;
    private javax.swing.JButton cellule78;
    private javax.swing.JButton cellule79;
    private javax.swing.JButton cellule80;
    private javax.swing.JButton cellule81;
    private javax.swing.JButton cellule810;
    private javax.swing.JButton cellule811;
    private javax.swing.JButton cellule812;
    private javax.swing.JButton cellule813;
    private javax.swing.JButton cellule814;
    private javax.swing.JButton cellule815;
    private javax.swing.JButton cellule82;
    private javax.swing.JButton cellule83;
    private javax.swing.JButton cellule84;
    private javax.swing.JButton cellule85;
    private javax.swing.JButton cellule86;
    private javax.swing.JButton cellule87;
    private javax.swing.JButton cellule88;
    private javax.swing.JButton cellule89;
    private javax.swing.JButton cellule90;
    private javax.swing.JButton cellule91;
    private javax.swing.JButton cellule910;
    private javax.swing.JButton cellule911;
    private javax.swing.JButton cellule912;
    private javax.swing.JButton cellule913;
    private javax.swing.JButton cellule914;
    private javax.swing.JButton cellule915;
    private javax.swing.JButton cellule92;
    private javax.swing.JButton cellule93;
    private javax.swing.JButton cellule94;
    private javax.swing.JButton cellule95;
    private javax.swing.JButton cellule96;
    private javax.swing.JButton cellule97;
    private javax.swing.JButton cellule98;
    private javax.swing.JButton cellule99;
    private javax.swing.JPanel infosjoueur2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel nomjoueur5;
    private javax.swing.JPanel panneaumodepartie;
    private javax.swing.JLabel scorejoueur5;
    // End of variables declaration//GEN-END:variables
}
