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

        cellule012.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule012ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule012);

        cellule013.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule013ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule013);

        cellule014.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule014ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule014);

        cellule015.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule015ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule015);

        cellule10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule10ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule10);

        cellule11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule11ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule11);

        cellule12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule12ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule12);

        cellule13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule13ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule13);

        cellule14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule14ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule14);

        cellule15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule15ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule15);

        cellule16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule16ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule16);

        cellule17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule17ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule17);

        cellule18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule18ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule18);

        cellule19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule19ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule19);

        cellule110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule110ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule110);

        cellule111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule111ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule111);

        cellule112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule112ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule112);

        cellule113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule113ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule113);

        cellule114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule114ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule114);

        cellule115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule115ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule115);

        cellule20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule20ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule20);

        cellule21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule21ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule21);

        cellule22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule22ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule22);

        cellule23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule23ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule23);

        cellule24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule24ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule24);

        cellule25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule25ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule25);

        cellule26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule26ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule26);

        cellule27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule27ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule27);

        cellule28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule28ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule28);

        cellule29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule29ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule29);

        cellule210.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule210ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule210);

        cellule211.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule211ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule211);

        cellule212.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule212ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule212);

        cellule213.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule213ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule213);

        cellule214.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule214ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule214);

        cellule215.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule215ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule215);

        cellule30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule30ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule30);

        cellule31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule31ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule31);

        cellule32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule32ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule32);

        cellule33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule33ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule33);

        cellule34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule34ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule34);

        cellule35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule35ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule35);

        cellule36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule36ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule36);

        cellule37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule37ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule37);

        cellule38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule38ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule38);

        cellule39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule39ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule39);

        cellule310.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule310ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule310);

        cellule311.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule311ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule311);

        cellule312.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule312ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule312);

        cellule313.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule313ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule313);

        cellule314.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule314ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule314);

        cellule315.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule315ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule315);

        cellule40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule40ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule40);

        cellule41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule41ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule41);

        cellule42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule42ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule42);

        cellule43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule43ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule43);

        cellule44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule44ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule44);

        cellule45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule45ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule45);

        cellule46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule46ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule46);

        cellule47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule47ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule47);

        cellule48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule48ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule48);

        cellule49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule49ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule49);

        cellule410.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule410ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule410);

        cellule411.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule411ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule411);

        cellule412.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule412ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule412);

        cellule413.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule413ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule413);

        cellule414.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule414ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule414);

        cellule415.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule415ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule415);

        cellule50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule50ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule50);

        cellule51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule51ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule51);

        cellule52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule52ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule52);

        cellule53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule53ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule53);

        cellule54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule54ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule54);

        cellule55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule55ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule55);

        cellule56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule56ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule56);

        cellule57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule57ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule57);

        cellule58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule58ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule58);

        cellule59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule59ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule59);

        cellule510.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule510ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule510);

        cellule511.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule511ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule511);

        cellule512.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule512ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule512);

        cellule513.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule513ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule513);

        cellule514.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule514ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule514);

        cellule515.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule515ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule515);

        cellule60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule60ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule60);

        cellule61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule61ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule61);

        cellule62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule62ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule62);

        cellule63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule63ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule63);

        cellule64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule64ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule64);

        cellule65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule65ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule65);

        cellule66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule66ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule66);

        cellule67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule67ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule67);

        cellule68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule68ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule68);

        cellule69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule69ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule69);

        cellule610.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule610ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule610);

        cellule611.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule611ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule611);

        cellule612.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule612ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule612);

        cellule613.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule613ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule613);

        cellule614.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule614ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule614);

        cellule615.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule615ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule615);

        cellule70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule70ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule70);

        cellule71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule71ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule71);

        cellule72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule72ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule72);

        cellule73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule73ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule73);

        cellule74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule74ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule74);

        cellule75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule75ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule75);

        cellule76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule76ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule76);

        cellule77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule77ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule77);

        cellule78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule78ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule78);

        cellule79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule79ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule79);

        cellule710.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule710ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule710);

        cellule711.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule711ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule711);

        cellule712.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule712ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule712);

        cellule713.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule713ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule713);

        cellule714.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule714ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule714);

        cellule715.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule715ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule715);

        cellule80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule80ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule80);

        cellule81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule81ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule81);

        cellule82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule82ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule82);

        cellule83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule83ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule83);

        cellule84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule84ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule84);

        cellule85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule85ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule85);

        cellule86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule86ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule86);

        cellule87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule87ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule87);

        cellule88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule88ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule88);

        cellule89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule89ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule89);

        cellule810.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule810ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule810);

        cellule811.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule811ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule811);

        cellule812.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule812ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule812);

        cellule813.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule813ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule813);

        cellule814.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule814ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule814);

        cellule815.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule815ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule815);

        cellule90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule90ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule90);

        cellule91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule91ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule91);

        cellule92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule92ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule92);

        cellule93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule93ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule93);

        cellule94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule94ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule94);

        cellule95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule95ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule95);

        cellule96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule96ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule96);

        cellule97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule97ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule97);

        cellule98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule98ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule98);

        cellule99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule99ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule99);

        cellule910.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule910ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule910);

        cellule911.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule911ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule911);

        cellule912.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule912ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule912);

        cellule913.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule913ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule913);

        cellule914.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule914ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule914);

        cellule915.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule915ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule915);

        cellule10_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule10_0ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule10_0);

        cellule10_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule10_1ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule10_1);

        cellule10_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule10_2ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule10_2);

        cellule10_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule10_3ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule10_3);

        cellule10_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule10_4ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule10_4);

        cellule10_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule10_5ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule10_5);

        cellule10_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule10_6ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule10_6);

        cellule10_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule10_7ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule10_7);

        cellule10_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule10_8ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule10_8);

        cellule10_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule10_9ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule10_9);

        cellule10_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule10_10ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule10_10);

        cellule10_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule10_11ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule10_11);

        cellule10_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule10_12ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule10_12);

        cellule10_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule10_13ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule10_13);

        cellule10_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule10_14ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule10_14);

        cellule10_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule10_15ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule10_15);

        cellule11_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule11_0ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule11_0);

        cellule11_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule11_1ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule11_1);

        cellule11_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule11_2ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule11_2);

        cellule11_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule11_3ActionPerformed(evt);
            }
        });
        Panneaugrille_16x16.add(cellule11_3);

        cellule11_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule11_4ActionPerformed(evt);
            }
        });
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
if (CellulesJeu[4][5].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(4,5);
            celluleGraphique[4][5].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule45ActionPerformed

    private void cellule62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule62ActionPerformed
if (CellulesJeu[6][2].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(6,2);
            celluleGraphique[6][2].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule62ActionPerformed

    private void cellule711ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule711ActionPerformed
     if (CellulesJeu[7][11].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(7,11);
            celluleGraphique[7][11].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
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
if (CellulesJeu[0][11].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(0,11);
            celluleGraphique[0][11].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule011ActionPerformed

    private void cellule012ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule012ActionPerformed
if (CellulesJeu[0][12].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(0,12);
            celluleGraphique[0][12].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule012ActionPerformed

    private void cellule013ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule013ActionPerformed
if (CellulesJeu[0][13].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(0,13);
            celluleGraphique[0][13].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule013ActionPerformed

    private void cellule014ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule014ActionPerformed
if (CellulesJeu[0][14].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(0,14);
            celluleGraphique[0][14].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule014ActionPerformed

    private void cellule015ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule015ActionPerformed
if (CellulesJeu[0][15].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(0,15);
            celluleGraphique[0][15].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule015ActionPerformed

    private void cellule10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule10ActionPerformed
if (CellulesJeu[1][0].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(1,0);
            celluleGraphique[1][0].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule10ActionPerformed

    private void cellule11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule11ActionPerformed
if (CellulesJeu[1][1].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(1,1);
            celluleGraphique[1][1].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule11ActionPerformed

    private void cellule12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule12ActionPerformed
if (CellulesJeu[1][2].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(1,2);
            celluleGraphique[1][2].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule12ActionPerformed

    private void cellule13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule13ActionPerformed
if (CellulesJeu[1][3].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(1,3);
            celluleGraphique[1][3].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule13ActionPerformed

    private void cellule14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule14ActionPerformed
if (CellulesJeu[1][4].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(1,4);
            celluleGraphique[1][4].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule14ActionPerformed

    private void cellule15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule15ActionPerformed
if (CellulesJeu[1][5].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(1,5);
            celluleGraphique[1][5].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule15ActionPerformed

    private void cellule16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule16ActionPerformed
if (CellulesJeu[1][6].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(1,6);
            celluleGraphique[1][6].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule16ActionPerformed

    private void cellule17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule17ActionPerformed
if (CellulesJeu[1][7].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(1,7);
            celluleGraphique[1][7].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule17ActionPerformed

    private void cellule18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule18ActionPerformed
if (CellulesJeu[1][8].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(1,8);
            celluleGraphique[1][8].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule18ActionPerformed

    private void cellule19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule19ActionPerformed
if (CellulesJeu[1][9].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(1,9);
            celluleGraphique[1][9].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule19ActionPerformed

    private void cellule110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule110ActionPerformed
if (CellulesJeu[1][10].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(1,10);
            celluleGraphique[1][10].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule110ActionPerformed

    private void cellule111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule111ActionPerformed
if (CellulesJeu[1][11].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(1,11);
            celluleGraphique[1][11].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule111ActionPerformed

    private void cellule112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule112ActionPerformed
if (CellulesJeu[1][12].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(1,12);
            celluleGraphique[1][12].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule112ActionPerformed

    private void cellule113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule113ActionPerformed
if (CellulesJeu[1][13].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(1,13);
            celluleGraphique[1][13].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule113ActionPerformed

    private void cellule114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule114ActionPerformed
if (CellulesJeu[1][14].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(1,14);
            celluleGraphique[1][14].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule114ActionPerformed

    private void cellule115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule115ActionPerformed
if (CellulesJeu[1][15].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(1,15);
            celluleGraphique[1][15].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule115ActionPerformed

    private void cellule20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule20ActionPerformed
if (CellulesJeu[2][0].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(2,0);
            celluleGraphique[2][0].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule20ActionPerformed

    private void cellule21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule21ActionPerformed
if (CellulesJeu[2][1].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(2,1);
            celluleGraphique[2][1].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }            // TODO add your handling code here:
    }//GEN-LAST:event_cellule21ActionPerformed

    private void cellule22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule22ActionPerformed
if (CellulesJeu[2][2].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(2,2);
            celluleGraphique[2][2].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }            // TODO add your handling code here:
    }//GEN-LAST:event_cellule22ActionPerformed

    private void cellule23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule23ActionPerformed
        if (CellulesJeu[2][3].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(2,3);
            celluleGraphique[2][3].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }   // TODO add your handling code here:
    }//GEN-LAST:event_cellule23ActionPerformed

    private void cellule24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule24ActionPerformed
if (CellulesJeu[2][4].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(2,4);
            celluleGraphique[2][4].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }           // TODO add your handling code here:
    }//GEN-LAST:event_cellule24ActionPerformed

    private void cellule25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule25ActionPerformed
if (CellulesJeu[2][5].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(2,5);
            celluleGraphique[2][5].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }           // TODO add your handling code here:
    }//GEN-LAST:event_cellule25ActionPerformed

    private void cellule26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule26ActionPerformed
if (CellulesJeu[2][6].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(2,6);
            celluleGraphique[2][6].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }           // TODO add your handling code here:
    }//GEN-LAST:event_cellule26ActionPerformed

    private void cellule27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule27ActionPerformed
if (CellulesJeu[2][7].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(2,7);
            celluleGraphique[2][7].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }           // TODO add your handling code here:
    }//GEN-LAST:event_cellule27ActionPerformed

    private void cellule28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule28ActionPerformed
if (CellulesJeu[2][8].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(2,8);
            celluleGraphique[2][8].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }           // TODO add your handling code here:
    }//GEN-LAST:event_cellule28ActionPerformed

    private void cellule29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule29ActionPerformed
if (CellulesJeu[2][9].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(2,9);
            celluleGraphique[2][9].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }           // TODO add your handling code here:
    }//GEN-LAST:event_cellule29ActionPerformed

    private void cellule210ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule210ActionPerformed
if (CellulesJeu[2][10].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(2,10);
            celluleGraphique[2][10].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }           // TODO add your handling code here:
    }//GEN-LAST:event_cellule210ActionPerformed

    private void cellule211ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule211ActionPerformed
if (CellulesJeu[2][11].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(2,11);
            celluleGraphique[2][11].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }           // TODO add your handling code here:
    }//GEN-LAST:event_cellule211ActionPerformed

    private void cellule212ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule212ActionPerformed
if (CellulesJeu[2][12].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(2,12);
            celluleGraphique[2][12].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }           // TODO add your handling code here:
    }//GEN-LAST:event_cellule212ActionPerformed

    private void cellule213ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule213ActionPerformed
if (CellulesJeu[2][13].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(2,13);
            celluleGraphique[2][13].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }           // TODO add your handling code here:
    }//GEN-LAST:event_cellule213ActionPerformed

    private void cellule214ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule214ActionPerformed
if (CellulesJeu[2][14].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(2,14);
            celluleGraphique[2][14].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }           // TODO add your handling code here:
    }//GEN-LAST:event_cellule214ActionPerformed

    private void cellule215ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule215ActionPerformed
if (CellulesJeu[2][15].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(2,15);
            celluleGraphique[2][15].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }           // TODO add your handling code here:
    }//GEN-LAST:event_cellule215ActionPerformed

    private void cellule30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule30ActionPerformed
if (CellulesJeu[3][0].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(3,0);
            celluleGraphique[3][0].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }           // TODO add your handling code here:
    }//GEN-LAST:event_cellule30ActionPerformed

    private void cellule31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule31ActionPerformed
if (CellulesJeu[3][1].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(3,1);
            celluleGraphique[3][1].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }           // TODO add your handl        // TODO add your handling code here:
    }//GEN-LAST:event_cellule31ActionPerformed

    private void cellule32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule32ActionPerformed
if (CellulesJeu[3][2].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(3,2);
            celluleGraphique[3][2].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }           // TODO add your handl        // TODO add your handling code here:
    }//GEN-LAST:event_cellule32ActionPerformed

    private void cellule33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule33ActionPerformed
if (CellulesJeu[3][3].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(3,3);
            celluleGraphique[3][3].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }           // TODO add your handl        // TODO add your handling code here:
    }//GEN-LAST:event_cellule33ActionPerformed

    private void cellule34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule34ActionPerformed
if (CellulesJeu[3][4].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(3,4);
            celluleGraphique[3][4].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }           // TODO add your handl        // TODO add your handling code here:
    }//GEN-LAST:event_cellule34ActionPerformed

    private void cellule35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule35ActionPerformed
if (CellulesJeu[3][5].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(3,5);
            celluleGraphique[3][5].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }           // TODO add your handl        // TODO add your handling code here:
    }//GEN-LAST:event_cellule35ActionPerformed

    private void cellule36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule36ActionPerformed
if (CellulesJeu[3][6].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(3,6);
            celluleGraphique[3][6].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }           // TODO add your handl        // TODO add your handling code here:
    }//GEN-LAST:event_cellule36ActionPerformed

    private void cellule37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule37ActionPerformed
if (CellulesJeu[3][7].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(3,7);
            celluleGraphique[3][7].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }           // TODO add your handl        // TODO add your handling code here:
    }//GEN-LAST:event_cellule37ActionPerformed

    private void cellule38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule38ActionPerformed
if (CellulesJeu[3][8].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(3,8);
            celluleGraphique[3][8].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }           // TODO add your handl        // TODO add your handling code here:
    }//GEN-LAST:event_cellule38ActionPerformed

    private void cellule39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule39ActionPerformed
if (CellulesJeu[3][9].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(3,9);
            celluleGraphique[3][9].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }           // TODO add your handl        // TODO add your handling code here:
    }//GEN-LAST:event_cellule39ActionPerformed

    private void cellule310ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule310ActionPerformed
if (CellulesJeu[3][10].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(3,10);
            celluleGraphique[3][10].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }           // TODO add your handl        // TODO add your handling code here:
    }//GEN-LAST:event_cellule310ActionPerformed

    private void cellule311ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule311ActionPerformed
if (CellulesJeu[3][11].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(3,11);
            celluleGraphique[3][11].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }           // TODO add your handl        // TODO add your handling code here:
    }//GEN-LAST:event_cellule311ActionPerformed

    private void cellule312ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule312ActionPerformed
if (CellulesJeu[3][12].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(3,12);
            celluleGraphique[3][12].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }           // TODO add your handl        // TODO add your handling code here:
    }//GEN-LAST:event_cellule312ActionPerformed

    private void cellule313ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule313ActionPerformed
if (CellulesJeu[3][13].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(3,13);
            celluleGraphique[3][13].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }           // TODO add your handl        // TODO add your handling code here:
    }//GEN-LAST:event_cellule313ActionPerformed

    private void cellule314ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule314ActionPerformed
if (CellulesJeu[3][14].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(3,14);
            celluleGraphique[3][14].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }           // TODO add your handl        // TODO add your handling code here:
    }//GEN-LAST:event_cellule314ActionPerformed

    private void cellule315ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule315ActionPerformed
if (CellulesJeu[3][15].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(3,15);
            celluleGraphique[3][15].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }           // TODO add your handl        // TODO add your handling code here:
    }//GEN-LAST:event_cellule315ActionPerformed

    private void cellule40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule40ActionPerformed
if (CellulesJeu[4][0].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(4,0);
            celluleGraphique[4][0].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }           
    }//GEN-LAST:event_cellule40ActionPerformed

    private void cellule41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule41ActionPerformed
if (CellulesJeu[4][1].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(4,1);
            celluleGraphique[4][1].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule41ActionPerformed

    private void cellule42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule42ActionPerformed
if (CellulesJeu[4][2].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(4,2);
            celluleGraphique[4][2].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule42ActionPerformed

    private void cellule43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule43ActionPerformed
if (CellulesJeu[4][3].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(4,3);
            celluleGraphique[4][3].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule43ActionPerformed

    private void cellule44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule44ActionPerformed
if (CellulesJeu[4][4].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(4,4);
            celluleGraphique[4][4].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule44ActionPerformed

    private void cellule46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule46ActionPerformed
if (CellulesJeu[4][6].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(4,6);
            celluleGraphique[4][6].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule46ActionPerformed

    private void cellule47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule47ActionPerformed
if (CellulesJeu[4][7].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(4,7);
            celluleGraphique[4][7].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule47ActionPerformed

    private void cellule48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule48ActionPerformed
if (CellulesJeu[4][8].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(4,8);
            celluleGraphique[4][8].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule48ActionPerformed

    private void cellule49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule49ActionPerformed
if (CellulesJeu[4][9].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(4,9);
            celluleGraphique[4][9].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule49ActionPerformed

    private void cellule410ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule410ActionPerformed
if (CellulesJeu[4][10].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(4,10);
            celluleGraphique[4][10].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule410ActionPerformed

    private void cellule411ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule411ActionPerformed
if (CellulesJeu[4][11].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(4,11);
            celluleGraphique[4][11].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule411ActionPerformed

    private void cellule412ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule412ActionPerformed
if (CellulesJeu[4][12].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(4,12);
            celluleGraphique[4][12].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule412ActionPerformed

    private void cellule413ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule413ActionPerformed
if (CellulesJeu[4][13].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(4,13);
            celluleGraphique[4][13].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule413ActionPerformed

    private void cellule414ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule414ActionPerformed
if (CellulesJeu[4][14].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(4,14);
            celluleGraphique[4][14].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule414ActionPerformed

    private void cellule415ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule415ActionPerformed
if (CellulesJeu[4][15].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(4,15);
            celluleGraphique[4][15].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule415ActionPerformed

    private void cellule50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule50ActionPerformed
if (CellulesJeu[5][0].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(5,0);
            celluleGraphique[5][0].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule50ActionPerformed

    private void cellule51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule51ActionPerformed
if (CellulesJeu[5][1].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(5,1);
            celluleGraphique[5][1].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule51ActionPerformed

    private void cellule52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule52ActionPerformed
if (CellulesJeu[5][2].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(5,2);
            celluleGraphique[5][2].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule52ActionPerformed

    private void cellule53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule53ActionPerformed
if (CellulesJeu[5][3].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(5,3);
            celluleGraphique[5][3].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule53ActionPerformed

    private void cellule54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule54ActionPerformed
if (CellulesJeu[5][4].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(5,4);
            celluleGraphique[5][4].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule54ActionPerformed

    private void cellule55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule55ActionPerformed
if (CellulesJeu[5][5].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(5,5);
            celluleGraphique[5][5].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule55ActionPerformed

    private void cellule56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule56ActionPerformed
if (CellulesJeu[5][6].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(5,6);
            celluleGraphique[5][6].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule56ActionPerformed

    private void cellule57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule57ActionPerformed
if (CellulesJeu[5][7].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(5,7);
            celluleGraphique[5][7].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule57ActionPerformed

    private void cellule58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule58ActionPerformed
if (CellulesJeu[5][8].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(5,8);
            celluleGraphique[5][8].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule58ActionPerformed

    private void cellule59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule59ActionPerformed
if (CellulesJeu[5][9].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(5,9);
            celluleGraphique[5][9].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule59ActionPerformed

    private void cellule510ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule510ActionPerformed
if (CellulesJeu[5][10].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(5,10);
            celluleGraphique[5][10].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule510ActionPerformed

    private void cellule511ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule511ActionPerformed
if (CellulesJeu[5][11].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(5,11);
            celluleGraphique[5][11].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule511ActionPerformed

    private void cellule512ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule512ActionPerformed
if (CellulesJeu[5][12].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(5,12);
            celluleGraphique[5][12].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule512ActionPerformed

    private void cellule513ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule513ActionPerformed
if (CellulesJeu[5][13].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(5,13);
            celluleGraphique[5][13].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule513ActionPerformed

    private void cellule514ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule514ActionPerformed
if (CellulesJeu[5][14].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(5,14);
            celluleGraphique[5][14].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule514ActionPerformed

    private void cellule515ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule515ActionPerformed
if (CellulesJeu[5][15].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(5,15);
            celluleGraphique[5][15].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule515ActionPerformed

    private void cellule60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule60ActionPerformed
if (CellulesJeu[6][0].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(6,0);
            celluleGraphique[6][0].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule60ActionPerformed

    private void cellule61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule61ActionPerformed
if (CellulesJeu[6][1].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(6,1);
            celluleGraphique[6][1].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule61ActionPerformed

    private void cellule63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule63ActionPerformed
if (CellulesJeu[6][3].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(6,3);
            celluleGraphique[6][3].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule63ActionPerformed

    private void cellule64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule64ActionPerformed
if (CellulesJeu[6][4].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(6,4);
            celluleGraphique[6][4].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule64ActionPerformed

    private void cellule65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule65ActionPerformed
if (CellulesJeu[6][5].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(6,5);
            celluleGraphique[6][5].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule65ActionPerformed

    private void cellule66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule66ActionPerformed
if (CellulesJeu[6][6].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(6,6);
            celluleGraphique[6][6].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule66ActionPerformed

    private void cellule67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule67ActionPerformed
if (CellulesJeu[6][7].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(6,7);
            celluleGraphique[6][7].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule67ActionPerformed

    private void cellule68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule68ActionPerformed
if (CellulesJeu[6][8].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(6,8);
            celluleGraphique[6][8].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule68ActionPerformed

    private void cellule69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule69ActionPerformed
if (CellulesJeu[6][9].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(6,9);
            celluleGraphique[6][9].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule69ActionPerformed

    private void cellule610ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule610ActionPerformed
if (CellulesJeu[6][10].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(6,10);
            celluleGraphique[6][10].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule610ActionPerformed

    private void cellule611ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule611ActionPerformed
if (CellulesJeu[6][11].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(6,11);
            celluleGraphique[6][11].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule611ActionPerformed

    private void cellule612ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule612ActionPerformed
if (CellulesJeu[6][12].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(6,12);
            celluleGraphique[6][12].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule612ActionPerformed

    private void cellule613ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule613ActionPerformed
if (CellulesJeu[6][13].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(6,13);
            celluleGraphique[6][13].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule613ActionPerformed

    private void cellule614ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule614ActionPerformed
if (CellulesJeu[6][14].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(6,14);
            celluleGraphique[6][14].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule614ActionPerformed

    private void cellule615ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule615ActionPerformed
if (CellulesJeu[6][15].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(6,15);
            celluleGraphique[6][15].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule615ActionPerformed

    private void cellule70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule70ActionPerformed
     if (CellulesJeu[7][0].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(7,0);
            celluleGraphique[7][0].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }    // TODO add your handling code here:
    }//GEN-LAST:event_cellule70ActionPerformed

    private void cellule71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule71ActionPerformed
     if (CellulesJeu[7][1].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(7,1);
            celluleGraphique[7][1].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule71ActionPerformed

    private void cellule72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule72ActionPerformed
     if (CellulesJeu[7][2].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(7,2);
            celluleGraphique[7][2].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule72ActionPerformed

    private void cellule73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule73ActionPerformed
     if (CellulesJeu[7][3].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(7,3);
            celluleGraphique[7][3].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule73ActionPerformed

    private void cellule74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule74ActionPerformed
     if (CellulesJeu[7][4].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(7,4);
            celluleGraphique[7][4].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule74ActionPerformed

    private void cellule75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule75ActionPerformed
     if (CellulesJeu[7][5].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(7,5);
            celluleGraphique[7][5].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule75ActionPerformed

    private void cellule76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule76ActionPerformed
     if (CellulesJeu[7][6].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(7,6);
            celluleGraphique[7][6].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule76ActionPerformed

    private void cellule77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule77ActionPerformed
     if (CellulesJeu[7][7].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(7,7);
            celluleGraphique[7][7].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule77ActionPerformed

    private void cellule78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule78ActionPerformed
     if (CellulesJeu[7][8].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(7,8);
            celluleGraphique[7][8].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule78ActionPerformed

    private void cellule79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule79ActionPerformed
     if (CellulesJeu[7][9].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(7,9);
            celluleGraphique[7][9].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule79ActionPerformed

    private void cellule710ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule710ActionPerformed
     if (CellulesJeu[7][10].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(7,10);
            celluleGraphique[7][10].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule710ActionPerformed

    private void cellule712ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule712ActionPerformed
     if (CellulesJeu[7][12].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(7,12);
            celluleGraphique[7][12].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule712ActionPerformed

    private void cellule713ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule713ActionPerformed
     if (CellulesJeu[7][13].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(7,13);
            celluleGraphique[7][13].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule713ActionPerformed

    private void cellule714ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule714ActionPerformed
     if (CellulesJeu[7][14].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(7,14);
            celluleGraphique[7][14].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule714ActionPerformed

    private void cellule715ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule715ActionPerformed
     if (CellulesJeu[7][15].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(7,15);
            celluleGraphique[7][15].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule715ActionPerformed

    private void cellule80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule80ActionPerformed
     if (CellulesJeu[8][0].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(8,0);
            celluleGraphique[8][0].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cellule80ActionPerformed

    private void cellule81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule81ActionPerformed
     if (CellulesJeu[8][1].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(8,1);
            celluleGraphique[8][1].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule81ActionPerformed

    private void cellule82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule82ActionPerformed
     if (CellulesJeu[8][2].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(8,2);
            celluleGraphique[8][2].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule82ActionPerformed

    private void cellule83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule83ActionPerformed
     if (CellulesJeu[8][3].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(8,3);
            celluleGraphique[8][3].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule83ActionPerformed

    private void cellule84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule84ActionPerformed
     if (CellulesJeu[8][4].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(8,4);
            celluleGraphique[8][4].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule84ActionPerformed

    private void cellule85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule85ActionPerformed
     if (CellulesJeu[8][5].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(8,5);
            celluleGraphique[8][5].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule85ActionPerformed

    private void cellule86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule86ActionPerformed
     if (CellulesJeu[8][6].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(8,6);
            celluleGraphique[8][6].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule86ActionPerformed

    private void cellule87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule87ActionPerformed
     if (CellulesJeu[8][7].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(8,7);
            celluleGraphique[8][7].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule87ActionPerformed

    private void cellule88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule88ActionPerformed
     if (CellulesJeu[8][8].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(8,8);
            celluleGraphique[8][8].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule88ActionPerformed

    private void cellule89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule89ActionPerformed
     if (CellulesJeu[8][9].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(8,9);
            celluleGraphique[8][9].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule89ActionPerformed

    private void cellule810ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule810ActionPerformed
     if (CellulesJeu[8][10].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(8,10);
            celluleGraphique[8][10].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule810ActionPerformed

    private void cellule811ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule811ActionPerformed
     if (CellulesJeu[8][11].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(8,11);
            celluleGraphique[8][11].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule811ActionPerformed

    private void cellule812ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule812ActionPerformed
     if (CellulesJeu[8][12].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(8,12);
            celluleGraphique[8][12].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule812ActionPerformed

    private void cellule813ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule813ActionPerformed
     if (CellulesJeu[8][13].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(8,13);
            celluleGraphique[8][13].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule813ActionPerformed

    private void cellule814ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule814ActionPerformed
     if (CellulesJeu[8][14].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(8,14);
            celluleGraphique[8][14].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule814ActionPerformed

    private void cellule815ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule815ActionPerformed
     if (CellulesJeu[8][15].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(8,15);
            celluleGraphique[8][15].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule815ActionPerformed

    private void cellule90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule90ActionPerformed
     if (CellulesJeu[9][0].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(9,0);
            celluleGraphique[9][0].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule90ActionPerformed

    private void cellule91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule91ActionPerformed
     if (CellulesJeu[9][1].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(9,1);
            celluleGraphique[9][1].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule91ActionPerformed

    private void cellule92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule92ActionPerformed
     if (CellulesJeu[9][2].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(9,2);
            celluleGraphique[9][2].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule92ActionPerformed

    private void cellule93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule93ActionPerformed
     if (CellulesJeu[9][3].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(9,3);
            celluleGraphique[9][3].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule93ActionPerformed

    private void cellule94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule94ActionPerformed
     if (CellulesJeu[9][4].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(9,4);
            celluleGraphique[9][4].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule94ActionPerformed

    private void cellule95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule95ActionPerformed
     if (CellulesJeu[9][5].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(9,5);
            celluleGraphique[9][5].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule95ActionPerformed

    private void cellule96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule96ActionPerformed
     if (CellulesJeu[9][6].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(9,6);
            celluleGraphique[9][6].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule96ActionPerformed

    private void cellule97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule97ActionPerformed
     if (CellulesJeu[9][7].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(9,7);
            celluleGraphique[9][7].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule97ActionPerformed

    private void cellule98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule98ActionPerformed
     if (CellulesJeu[9][8].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(9,8);
            celluleGraphique[9][8].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule98ActionPerformed

    private void cellule911ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule911ActionPerformed
     if (CellulesJeu[9][11].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(9,11);
            celluleGraphique[9][11].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule911ActionPerformed

    private void cellule99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule99ActionPerformed
     if (CellulesJeu[9][9].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(9,9);
            celluleGraphique[9][9].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule99ActionPerformed

    private void cellule910ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule910ActionPerformed
     if (CellulesJeu[9][10].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(9,10);
            celluleGraphique[9][10].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule910ActionPerformed

    private void cellule912ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule912ActionPerformed
     if (CellulesJeu[9][12].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(9,12);
            celluleGraphique[9][12].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule912ActionPerformed

    private void cellule913ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule913ActionPerformed
     if (CellulesJeu[9][13].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(9,13);
            celluleGraphique[9][13].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule913ActionPerformed

    private void cellule914ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule914ActionPerformed
     if (CellulesJeu[9][14].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(9,14);
            celluleGraphique[9][14].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule914ActionPerformed

    private void cellule915ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule915ActionPerformed
     if (CellulesJeu[9][15].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(9,15);
            celluleGraphique[9][15].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule915ActionPerformed

    private void cellule10_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule10_0ActionPerformed
     if (CellulesJeu[10][0].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(10,0);
            celluleGraphique[10][0].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule10_0ActionPerformed

    private void cellule10_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule10_1ActionPerformed
     if (CellulesJeu[10][1].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(10,1);
            celluleGraphique[10][1].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule10_1ActionPerformed

    private void cellule10_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule10_2ActionPerformed
     if (CellulesJeu[10][2].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(10,2);
            celluleGraphique[10][2].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule10_2ActionPerformed

    private void cellule10_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule10_3ActionPerformed
     if (CellulesJeu[10][3].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(10,3);
            celluleGraphique[10][3].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule10_3ActionPerformed

    private void cellule10_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule10_4ActionPerformed
     if (CellulesJeu[10][4].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(10,4);
            celluleGraphique[10][4].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule10_4ActionPerformed

    private void cellule10_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule10_5ActionPerformed
     if (CellulesJeu[10][5].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(10,5);
            celluleGraphique[10][5].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule10_5ActionPerformed

    private void cellule10_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule10_6ActionPerformed
     if (CellulesJeu[10][6].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(10,6);
            celluleGraphique[10][6].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule10_6ActionPerformed

    private void cellule10_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule10_7ActionPerformed
     if (CellulesJeu[10][7].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(10,7);
            celluleGraphique[10][7].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule10_7ActionPerformed

    private void cellule10_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule10_8ActionPerformed
     if (CellulesJeu[10][8].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(10,8);
            celluleGraphique[10][8].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule10_8ActionPerformed

    private void cellule10_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule10_9ActionPerformed
     if (CellulesJeu[10][9].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(10,9);
            celluleGraphique[10][9].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule10_9ActionPerformed

    private void cellule10_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule10_10ActionPerformed
     if (CellulesJeu[10][10].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(10,10);
            celluleGraphique[10][10].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule10_10ActionPerformed

    private void cellule10_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule10_11ActionPerformed
     if (CellulesJeu[10][11].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(10,11);
            celluleGraphique[10][11].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule10_11ActionPerformed

    private void cellule10_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule10_12ActionPerformed
     if (CellulesJeu[10][12].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(10,12);
            celluleGraphique[10][12].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule10_12ActionPerformed

    private void cellule10_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule10_13ActionPerformed
     if (CellulesJeu[10][13].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(10,13);
            celluleGraphique[10][13].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule10_13ActionPerformed

    private void cellule10_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule10_14ActionPerformed
     if (CellulesJeu[10][14].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(10,14);
            celluleGraphique[10][14].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule10_14ActionPerformed

    private void cellule10_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule10_15ActionPerformed
     if (CellulesJeu[10][15].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(10,15);
            celluleGraphique[10][15].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule10_15ActionPerformed

    private void cellule11_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule11_0ActionPerformed
     if (CellulesJeu[11][0].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(11,0);
            celluleGraphique[11][0].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cellule11_0ActionPerformed

    private void cellule11_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule11_1ActionPerformed
     if (CellulesJeu[11][1].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(11,1);
            celluleGraphique[11][1].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();        // TODO add your handling code here:
    }//GEN-LAST:event_cellule11_1ActionPerformed

    private void cellule11_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule11_2ActionPerformed
             if (CellulesJeu[11][2].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(11,2);
            celluleGraphique[11][2].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
    }//GEN-LAST:event_cellule11_2ActionPerformed

    private void cellule11_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule11_3ActionPerformed
     if (CellulesJeu[11][3].EstAllume){
            Score++;
            scorejoueur5.setText(""+Score);
            eteindreCellule(11,3);
            celluleGraphique[11][3].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();        // TODO add your handling code here:
    }//GEN-LAST:event_cellule11_3ActionPerformed

    private void cellule11_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule11_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cellule11_4ActionPerformed

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
