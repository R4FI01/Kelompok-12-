package ui;
import domain.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Dosen dosen1 = new Dosen("Dr. Akhdan", "12345");
            Dosen dosen2 = new Dosen("Dr. Hamid", "67890");
            Dosen dosen3 = new Dosen("Prof. Timy", "13579");
            Dosen dosen4 = new Dosen("Dr. Ayu", "24680");
            Dosen dosen5 = new Dosen("Dr. Tegar", "12457");
            Dosen dosen6 = new Dosen("Prof. Raka", "23568");
            Dosen dosen7 = new Dosen("Prof. Fatur", "34679");
            Dosen dosen8 = new Dosen("Dr. Nizar", "45781");
            Dosen dosen9 = new Dosen("Prof. Putri", "18762");
            Dosen dosen10 = new Dosen("Dr. Rafi", "18762");

            MataKuliah matkul1 = new MataKuliah("Pancasila", 3,
                    "Senin 08:00", 40, 1, dosen2);
            MataKuliah matkul2 = new MataKuliah("Bahasa Inggris I", 2,
                    "Senin 10:30", 40, 1, dosen5);
            MataKuliah matkul3 = new MataKuliah("Matematika", 3,
                    "Selasa 10:50", 40, 1, dosen3);
            MataKuliah matkul4 = new MataKuliah("Pemrograman Terstruktur", 3,
                    "Rabu 14:00, Kamis 14.00", 35, 1, dosen9);
            MataKuliah matkul5 = new MataKuliah("Sistem Digital", 3,
                    "Kamis 14:00", 40, 1, dosen7);
            MataKuliah matkul6 = new MataKuliah("Aljabar Linear", 2,
                    "Rabu 08:50", 40, 1, dosen2);
            MataKuliah matkul7 = new MataKuliah("Sosio Teknologi Informasi", 3,
                    "Kamis 10:50", 40, 1, dosen1);
            MataKuliah matkul8 = new MataKuliah("Praktikum Pemrograman Terstruktur", 1,
                    "Jumat 15:00, Kamis 16.20", 100, 1, dosen9);
            MataKuliah matkul9 = new MataKuliah("Struktur Data", 3,
                    "Selasa 10:50", 40, 2, dosen4);
            MataKuliah matkul10 = new MataKuliah("Matematika Diskrit", 3,
                    "Rabu 12:30", 40, 2, dosen1);
            MataKuliah matkul11 = new MataKuliah("Rekayasa Perangkat Lunak", 3,
                    "Rabu 08:00", 40, 2, dosen6);
            MataKuliah matkul12 = new MataKuliah("Arsitektur Organisai Komputer", 3,
                    "Senin 10:50", 40, 2, dosen7);
            MataKuliah matkul13 = new MataKuliah("Fisika", 3,
                    "Selasa 10:50", 40, 2, dosen8);
            MataKuliah matkul14 = new MataKuliah("Bahasa Inggris II", 2,
                    "Kamis 15:20", 40, 2, dosen9);
            MataKuliah matkul15 = new MataKuliah("Kewarganegaraan", 2,
                    "Senin 08:00", 40, 2, dosen5);
            MataKuliah matkul16 = new MataKuliah("Pemrograman Berorientasi Objek", 3,
                    "Rabu 08:50, Jumat 08.00", 30, 3, dosen1);
            MataKuliah matkul17 = new MataKuliah("Perancangan dan Analisi Algoritma", 3,
                    "Kamis 12:30", 40, 3, dosen2);
            MataKuliah matkul18 = new MataKuliah("Analisis Perancangan Sistem", 3,
                    "Kamis 08:00", 33, 3, dosen3);
            MataKuliah matkul19 = new MataKuliah("Grafika Komputer", 3,
                    "Rabu 12:30", 35, 3, dosen4);
            MataKuliah matkul20 = new MataKuliah("Sistem Operasi", 3,
                    "Selasa 14:20, Jumat 14.20", 30, 3, dosen5);
            MataKuliah matkul21 = new MataKuliah("Komputasi Numerik", 3,
                    "Selasa 10:50", 40, 3, dosen6);
            MataKuliah matkul22 = new MataKuliah("Praktikum Pemrograman Berorientasi Objek", 1,
                    "Rabu 15:20, 16.10, 19,00", 100, 3, dosen7);
            MataKuliah matkul23 = new MataKuliah("Praktikum Sistem Operasi", 1,
                    "Selasa 16:00, Kamis 16.00, Jumat 10.00", 100, 3, dosen8);
            MataKuliah matkul24 = new MataKuliah("Basis Data", 3,
                    "Senin 08:30", 40, 4, dosen4);
            MataKuliah matkul25 = new MataKuliah("Konsep Teknologi", 3,
                    "Selasa 14:20", 40, 4, dosen2);
            MataKuliah matkul26 = new MataKuliah("Kecerdasan Buatan", 3,
                    "Rabu 08:00", 40, 4, dosen6);
            MataKuliah matkul27 = new MataKuliah("Jaringan Komputer", 3,
                    "Rabu 12:30", 40, 4, dosen7);
            MataKuliah matkul28 = new MataKuliah("Pemograman Web", 3,
                    "Kamis 12:50", 40, 4, dosen8);
            MataKuliah matkul29 = new MataKuliah("Bahasa Indonesia", 2,
                    "Kamis 08:00", 40, 4, dosen9);
            MataKuliah matkul30 = new MataKuliah("Pendidikan Karakter", 2,
                    "Jumat 13:50", 40, 4, dosen1);
            MataKuliah matkul31 = new MataKuliah("Agama ", 2,
                    "Jumat 80:00", 40, 4, dosen10);
            MataKuliah matkul32 = new MataKuliah("Praktikum Basis Data", 3,
                    "Rabu 15:00, 16:00, 19:00 ", 40, 4, dosen4);


            Mahasiswa mahasiswa1 = new MahasiswaReguler("Mas Abdurrahman Raafi", "06.2023.1.07701",
                    "Informatika", "Teknik");
            Mahasiswa mahasiswa2 = new MahasiswaKelasMalam("Fede Ricko Vinsenso", "06.2023.1.077002",
                    "Informatika", "Teknik");

            SistemInformasi sistem1 = new SistemInformasi(mahasiswa1, 1200000);
            SistemInformasi sistem2 = new SistemInformasi(mahasiswa2, 1500000);

            sistem1.tambahNilai(matkul16, new Nilai(80, 85, 90, 100));
            sistem1.tambahNilai(matkul17, new Nilai(84, 80, 85, 90));
            sistem1.tambahNilai(matkul18, new Nilai(88, 82, 85, 100));
            sistem1.tambahNilai(matkul19, new Nilai(90, 92, 85, 85));
            sistem1.tambahNilai(matkul20, new Nilai(94, 84, 85, 95));
            sistem1.tambahNilai(matkul21, new Nilai(88, 89, 85, 75));
            sistem1.tambahNilai(matkul22, new Nilai(95, 90, 85, 80));
            sistem1.tambahNilai(matkul23, new Nilai(82, 85, 85, 95));

            sistem2.tambahNilai(matkul16, new Nilai(80, 95, 80, 100));
            sistem2.tambahNilai(matkul17, new Nilai(90, 85, 87, 95));
            sistem2.tambahNilai(matkul18, new Nilai(86, 90, 85, 95));
            sistem2.tambahNilai(matkul19, new Nilai(91, 88, 90, 90));
            sistem2.tambahNilai(matkul20, new Nilai(84, 81, 85, 85));
            sistem2.tambahNilai(matkul21, new Nilai(88, 75, 80, 75));
            sistem2.tambahNilai(matkul22, new Nilai(92, 92, 95, 80));
            sistem2.tambahNilai(matkul23, new Nilai(79, 89, 90, 100));

            MahasiswaPortal portal1 = new MahasiswaPortal("Mas Abdurrahman Raafi", "06.2023.1.07701",
                    "rafi@gmail.com", "password1", sistem1);
            MahasiswaPortal portal2 = new MahasiswaPortal("Fede Ricko Vinsenso", "06.2023.1.077002",
                    "ricko@gmail.com", "password2", sistem2);

            List<MahasiswaPortal> portals = Arrays.asList(portal1, portal2);

            MahasiswaPortal currentPortal = null;
            while (currentPortal == null) {
                System.out.println("\n=== Sistem Informasi Kampus ===");
                System.out.print("Masukkan email: ");
                String email = scanner.nextLine();
                System.out.print("Masukkan password: ");
                String password = scanner.nextLine();

                for (MahasiswaPortal portal : portals) {
                    if (portal.validateLogin(email, password)) {
                        currentPortal = portal;
                        break;
                    }
                }

                if (currentPortal == null) {
                    System.out.println("Email atau password salah. Silakan coba lagi.");
                }
            }

            SistemInformasi sistem = currentPortal.getSistemInformasi();

            int pilihan;
            do {
                System.out.println("\n=== Sistem Informasi Kampus ===");
                System.out.println("1. Tampilkan Profil");
                System.out.println("2. Isi KRS");
                System.out.println("3. Hapus Mata Kuliah dari KRS");
                System.out.println("4. Tampilkan KRS");
                System.out.println("5. Tampilkan KHS");
                System.out.println("6. Tampilkan Keuangan");
                System.out.println("7. Bayar Tagihan");
                System.out.println("8. Keluar");
                System.out.print("Pilih menu: ");
                pilihan = scanner.nextInt();
                scanner.nextLine();

                try {
                    switch (pilihan) {
                        case 1:
                            System.out.println(sistem.getMahasiswa().getProfil());
                            break;
                        case 2:
                            System.out.println("Pilih Mata Kuliah untuk ditambahkan ke KRS:");
                            System.out.println("1. " + matkul1.getDetailMatkul());
                            System.out.println("2. " + matkul2.getDetailMatkul());
                            System.out.println("3. " + matkul3.getDetailMatkul());
                            System.out.println("4. " + matkul4.getDetailMatkul());
                            System.out.println("5. " + matkul5.getDetailMatkul());
                            System.out.println("6. " + matkul6.getDetailMatkul());
                            System.out.println("7. " + matkul7.getDetailMatkul());
                            System.out.println("8. " + matkul8.getDetailMatkul());
                            System.out.println("9. " + matkul9.getDetailMatkul());
                            System.out.println("10. " + matkul10.getDetailMatkul());
                            System.out.println("11. " + matkul11.getDetailMatkul());
                            System.out.println("12. " + matkul12.getDetailMatkul());
                            System.out.println("13. " + matkul13.getDetailMatkul());
                            System.out.println("14. " + matkul14.getDetailMatkul());
                            System.out.println("15. " + matkul15.getDetailMatkul());
                            System.out.println("16. " + matkul16.getDetailMatkul());
                            System.out.println("17. " + matkul17.getDetailMatkul());
                            System.out.println("18. " + matkul18.getDetailMatkul());
                            System.out.println("19. " + matkul19.getDetailMatkul());
                            System.out.println("20. " + matkul20.getDetailMatkul());
                            System.out.println("21. " + matkul21.getDetailMatkul());
                            System.out.println("22. " + matkul22.getDetailMatkul());
                            System.out.println("23. " + matkul23.getDetailMatkul());
                            System.out.println("24. " + matkul24.getDetailMatkul());
                            System.out.println("25. " + matkul25.getDetailMatkul());
                            System.out.println("26. " + matkul26.getDetailMatkul());
                            System.out.println("27. " + matkul27.getDetailMatkul());
                            System.out.println("28. " + matkul28.getDetailMatkul());
                            System.out.println("29. " + matkul29.getDetailMatkul());
                            System.out.println("30. " + matkul30.getDetailMatkul());
                            System.out.println("31. " + matkul31.getDetailMatkul());
                            System.out.println("32. " + matkul32.getDetailMatkul());

                            System.out.print("Masukkan pilihan: ");
                            int matkulPilihan = scanner.nextInt();
                            scanner.nextLine();

                            if (matkulPilihan == 1) {
                                sistem.isiKRS(matkul1);
                            } else if (matkulPilihan == 2) {
                                sistem.isiKRS(matkul2);
                            } else if (matkulPilihan == 3) {
                                    sistem.isiKRS(matkul3);
                            } else if (matkulPilihan == 4) {
                                sistem.isiKRS(matkul4);
                            } else if (matkulPilihan == 5) {
                                sistem.isiKRS(matkul5);
                            } else if (matkulPilihan == 6) {
                                sistem.isiKRS(matkul6);
                            } else if (matkulPilihan == 7) {
                                sistem.isiKRS(matkul7);
                            } else if (matkulPilihan == 8) {
                                sistem.isiKRS(matkul8);
                            } else if (matkulPilihan == 9) {
                                sistem.isiKRS(matkul9);
                            } else if (matkulPilihan == 10) {
                                sistem.isiKRS(matkul10);
                            } else if (matkulPilihan == 11) {
                                sistem.isiKRS(matkul11);
                            } else if (matkulPilihan == 12) {
                                sistem.isiKRS(matkul12);
                            } else if (matkulPilihan == 13) {
                                sistem.isiKRS(matkul13);
                            } else if (matkulPilihan == 14) {
                                sistem.isiKRS(matkul14);
                            } else if (matkulPilihan == 15) {
                                sistem.isiKRS(matkul15);
                            } else if (matkulPilihan == 16) {
                                sistem.isiKRS(matkul16);
                            } else if (matkulPilihan == 17) {
                                sistem.isiKRS(matkul17);
                            } else if (matkulPilihan == 18) {
                                sistem.isiKRS(matkul18);
                            } else if (matkulPilihan == 19) {
                                sistem.isiKRS(matkul19);
                            } else if (matkulPilihan == 20) {
                                sistem.isiKRS(matkul20);
                            } else if (matkulPilihan == 21) {
                                sistem.isiKRS(matkul21);
                            } else if (matkulPilihan == 22) {
                                sistem.isiKRS(matkul22);
                            } else if (matkulPilihan == 23) {
                                sistem.isiKRS(matkul23);
                            } else if (matkulPilihan == 24) {
                                sistem.isiKRS(matkul24);
                            } else if (matkulPilihan == 25) {
                                sistem.isiKRS(matkul25);
                            } else if (matkulPilihan == 26) {
                                sistem.isiKRS(matkul26);
                            } else if (matkulPilihan == 27) {
                                sistem.isiKRS(matkul27);
                            } else if (matkulPilihan == 28) {
                                sistem.isiKRS(matkul28);
                            } else if (matkulPilihan == 29) {
                                sistem.isiKRS(matkul29);
                            } else if (matkulPilihan == 30) {
                                sistem.isiKRS(matkul30);
                            } else if (matkulPilihan == 31) {
                                sistem.isiKRS(matkul31);
                            } else if (matkulPilihan == 32) {
                                sistem.isiKRS(matkul32);
                            } else {
                                System.out.println("Pilihan tidak valid.");
                            }
                            break;
                        case 3:
                            System.out.println("Pilih Mata Kuliah untuk dihapus dari KRS:");
                            for (int i = 0; i < sistem.getKRS().size(); i++) {
                                System.out.println((i + 1) + ". " + sistem.getKRS().get(i).getDetailMatkul());
                            }
                            System.out.print("Masukkan pilihan: ");
                            int hapusPilihan = scanner.nextInt();
                            scanner.nextLine();

                            if (hapusPilihan > 0 && hapusPilihan <= sistem.getKRS().size()) {
                                sistem.hapusKRS(sistem.getKRS().get(hapusPilihan - 1));
                            } else {
                                System.out.println("Pilihan tidak valid.");
                            }
                            break;
                        case 4:
                            sistem.tampilkanKRS();
                            break;
                        case 5:
                            sistem.tampilkanKHS();
                            break;
                        case 6:
                            sistem.getKeuangan().tampilkanStatusKeuangan();
                            break;
                        case 7:
                            System.out.print("Masukkan jumlah pembayaran: ");
                            double jumlah = scanner.nextDouble();
                            scanner.nextLine();
                            sistem.getKeuangan().bayar(jumlah);
                            break;
                        case 8:
                            System.out.println("Terima kasih.");
                            break;
                        default:
                            System.out.println("Pilihan tidak valid.");
                    }
                } catch (Exception e) {
                    System.out.println("Terjadi kesalahan: " + e.getMessage());
                }
            } while (pilihan != 8);
        } catch (Exception e) {
            System.out.println("Kesalahan sistem: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}