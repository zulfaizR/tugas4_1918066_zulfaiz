package com.example.pertemuan4_recylrbin;

public class item {
        private String namacoin,ranking,asal;
        private int logo;

        public item(String namacoin, String ranking, String asal, int logo) {
            this.namacoin = namacoin;
            this.ranking = ranking;
            this.asal = asal;
            this.logo = logo;
        }

        public String getNamacoin() {
            return namacoin;
        }

        public void setNamacoin(String namacoin) {
            this.namacoin = namacoin;
        }

        public String getRanking() {
            return ranking;
        }

        public void setRanking(String pemilik) {this.ranking = ranking; }

        public String getAsal() {
            return asal;
        }

        public void setAsal(String asal) {
            this.asal = asal;
        }

        public int getLogo() {
            return logo;
        }

        public void setLogo(int logo) {
            this.logo = logo;
        }
    }


