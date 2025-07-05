-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 02 Jul 2025 pada 12.41
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `toko_kelontong`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE `barang` (
  `kode_barang` int(50) NOT NULL,
  `Nama_Barang` varchar(50) NOT NULL,
  `kategori` varchar(50) NOT NULL,
  `harga` decimal(10,2) NOT NULL,
  `stok` int(11) NOT NULL,
  `barang_masuk` int(11) DEFAULT 0,
  `barang_keluar` int(11) DEFAULT 0,
  `total_stok` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `barang`
--

INSERT INTO `barang` (`kode_barang`, `Nama_Barang`, `kategori`, `harga`, `stok`, `barang_masuk`, `barang_keluar`, `total_stok`) VALUES
(26, 'Tas', 'Aksesoris', 200000.00, 25, 0, 5, 20),
(27, 'Dompet', 'Aksesoris', 50000.00, 20, 5, 5, 20),
(28, 'Korek', 'Alat', 25000.00, 20, 10, 5, 25),
(29, 'Belt', 'Aksesoris', 50000.00, 30, 80, 10, 100),
(30, 'Thanksinsomnia', 'T-Shirt', 150000.00, 20, 10, 5, 25),
(31, 'Stone Island', 'Jacket', 3990000.00, 5, 5, 7, 3),
(32, 'Adidas', 'Sepatu', 2990000.00, 5, 5, 5, 5),
(33, 'Bola', 'Sport', 50000.00, 20, 0, 0, 20),
(34, 'Geoff Maxx', 'Sendal', 70000.00, 20, 0, 0, 20),
(35, 'Calvin Klein', 'Aksesoris', 100000.00, 10, 10, 10, 10),
(36, 'Zippo', 'Alat', 150000.00, 20, 0, 5, 15),
(37, 'Casio', 'Aksesoris', 250000.00, 20, 10, 30, 0),
(44, 'Celana', 'Aksesoris', 150000.00, 25, 0, 0, 25),
(56, 'jaket', 'Aksesoris', 200000.00, 20, 50, 20, 50);

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang_keluar`
--

CREATE TABLE `barang_keluar` (
  `id` int(11) NOT NULL,
  `kode_barang` int(11) NOT NULL,
  `nama_barang` varchar(100) DEFAULT NULL,
  `jumlah` int(11) DEFAULT NULL,
  `harga` decimal(12,2) DEFAULT NULL,
  `tanggal_keluar` date DEFAULT NULL,
  `total_harga` decimal(12,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `barang_keluar`
--

INSERT INTO `barang_keluar` (`id`, `kode_barang`, `nama_barang`, `jumlah`, `harga`, `tanggal_keluar`, `total_harga`) VALUES
(26, 26, 'Tas', 5, 150000.00, '2025-06-13', 750000.00),
(27, 27, 'Dompet', 5, 50000.00, '2025-06-20', 250000.00),
(29, 28, 'Korek', 5, 25000.00, '2025-06-25', 125000.00),
(30, 29, 'Belt', 10, 50000.00, '2025-06-25', 500000.00),
(31, 30, 'Thanksinsomnia', 5, 150000.00, '2025-06-26', 750000.00),
(32, 31, 'Stone Island', 2, 3990000.00, '2025-06-26', 7980000.00),
(33, 35, 'Calvin Klein', 10, 100000.00, '2025-06-25', 1000000.00),
(34, 37, 'Casio', 10, 250000.00, '2025-06-26', 2500000.00),
(35, 36, 'Zippo', 5, 150000.00, '2025-06-27', 750000.00),
(39, 31, 'Stone Island', 5, 3990000.00, '2025-06-25', 19950000.00),
(41, 37, 'Casio', 20, 250000.00, '2025-06-30', 5000000.00),
(43, 32, 'Adidas', 5, 2990000.00, '2025-06-28', 14950000.00),
(45, 56, 'jaket', 20, 200000.00, '2025-07-31', 4000000.00);

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang_masuk`
--

CREATE TABLE `barang_masuk` (
  `id` int(11) NOT NULL,
  `kode_barang` int(11) NOT NULL,
  `nama_barang` varchar(100) DEFAULT NULL,
  `jumlah` int(11) DEFAULT NULL,
  `harga` decimal(12,2) DEFAULT NULL,
  `tanggal_masuk` date DEFAULT NULL,
  `total_harga` decimal(12,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `barang_masuk`
--

INSERT INTO `barang_masuk` (`id`, `kode_barang`, `nama_barang`, `jumlah`, `harga`, `tanggal_masuk`, `total_harga`) VALUES
(38, 27, 'Dompet', 5, 50000.00, '2025-06-19', 250000.00),
(40, 28, 'Korek', 10, 25000.00, '2025-06-20', 250000.00),
(41, 29, 'Belt', 5, 50000.00, '2025-06-20', 250000.00),
(42, 30, 'Thanksinsomnia', 10, 150000.00, '2025-06-20', 1500000.00),
(43, 31, 'Stone Island', 5, 3990000.00, '2025-06-22', 19950000.00),
(44, 32, 'Adidas', 5, 2990000.00, '2025-06-22', 14950000.00),
(45, 35, 'Calvin Klein', 10, 100000.00, '2025-06-24', 1000000.00),
(46, 37, 'Casio', 10, 250000.00, '2025-06-24', 2500000.00),
(47, 29, 'Belt', 5, 50000.00, '2025-06-02', 250000.00),
(48, 29, 'Belt', 70, 50000.00, '2025-06-27', 3500000.00),
(62, 56, 'jaket', 50, 200000.00, '2025-07-17', 10000000.00);

-- --------------------------------------------------------

--
-- Struktur dari tabel `distributor`
--

CREATE TABLE `distributor` (
  `id_distributor` int(11) NOT NULL,
  `kode_barang` int(11) DEFAULT NULL,
  `nama_distributor` varchar(100) NOT NULL,
  `nama_barang` varchar(100) DEFAULT NULL,
  `telepon` varchar(20) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `distributor`
--

INSERT INTO `distributor` (`id_distributor`, `kode_barang`, `nama_distributor`, `nama_barang`, `telepon`, `email`) VALUES
(74, NULL, 'MegaTas Indo', 'Tas', '08277272', 'Megatas@indo.com'),
(76, NULL, 'IndoDompet Supply', 'Dompet', '081234567', 'dompetinaja@indo.com'),
(77, NULL, 'PT. Adidas Indonesia', 'Adidas', '089736351', 'adidasaja@indo.com'),
(79, NULL, 'PT.Thanksinsomnia', 'Thanksinsomnia', '0812382367', 'mohanhazian@indo.com'),
(80, NULL, 'PT. Nike Sejahtera', 'Nike', '08923212', 'nikeinaja@indo.com'),
(81, NULL, 'Stone Island', 'Stone Island', '089213231', 'pulaubatu@indo.com'),
(82, NULL, 'JewelryLine ID', 'Kalung', '083213221', 'kalunginaja@indo.com'),
(83, NULL, 'Geof Max Indonesia', 'Geof Max', '0889632323', 'geofmax@indo.com'),
(85, NULL, 'Casio', 'Jam Tangan', '0892726171', 'casio@gmail.com'),
(86, NULL, 'PT. Hotel Indonesia', 'Hotel', '087627388', 'hotelid@id.com'),
(89, NULL, 'jaketiindo', 'jaket', '0888222', 'jaketindo@indo'),
(91, NULL, 'bajusupply', 'Baju', '087253881609', 'supply@.co.id'),
(92, NULL, 'sendalIndo', 'Sendal', '0816287309', 'sendalindo@gmail.com'),
(93, NULL, 'Sendalnesia', 'Sendal', '080707376390', 'sendalnesia@co.id');

-- --------------------------------------------------------

--
-- Struktur dari tabel `jenis_barang`
--

CREATE TABLE `jenis_barang` (
  `kode_barang` int(11) NOT NULL,
  `nama_barang` varchar(100) NOT NULL,
  `jenis_barang` varchar(100) NOT NULL,
  `harga` decimal(12,2) NOT NULL DEFAULT 0.00,
  `stok` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `jenis_barang`
--

INSERT INTO `jenis_barang` (`kode_barang`, `nama_barang`, `jenis_barang`, `harga`, `stok`) VALUES
(28, 'Korek', 'Korek Gas kriket', 25000.00, 20),
(29, 'Belt', 'Belt Besi', 50000.00, 30),
(30, 'Thanksinsomnia', 'Alacarte T-Shirrt', 150000.00, 20),
(31, 'Stone Island', 'Jamrud', 3990000.00, 5),
(34, 'Geoff Maxx', 'Tungtung Sandal', 70000.00, 20),
(35, 'Calvin Klein', 'Celana Dalam', 100000.00, 10),
(36, 'Zippo', 'Zippo Basic', 150000.00, 20),
(37, 'Casio', 'Casio - Gshock', 250000.00, 20);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pemesanan_barang`
--

CREATE TABLE `pemesanan_barang` (
  `id` int(11) NOT NULL,
  `kode_barang` int(11) NOT NULL,
  `nama_barang` varchar(100) DEFAULT NULL,
  `jumlah` int(11) DEFAULT NULL,
  `harga` decimal(12,2) DEFAULT NULL,
  `tanggal_pemesanan` date DEFAULT NULL,
  `total_harga` decimal(12,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `pemesanan_barang`
--

INSERT INTO `pemesanan_barang` (`id`, `kode_barang`, `nama_barang`, `jumlah`, `harga`, `tanggal_pemesanan`, `total_harga`) VALUES
(1, 1, 'Tas', 20, 50000.00, '2025-06-10', 1000000.00),
(2, 2, 'Dompet', 5, 50000.00, '2025-06-10', 250000.00),
(3, 3, 'Adidas', 5, 1500000.00, '2025-06-12', 7500000.00),
(4, 4, 'Pride N Joy', 12, 199000.00, '2025-06-12', 2388000.00),
(5, 5, 'Thanksinsomnia', 7, 120000.00, '2025-06-12', 840000.00),
(6, 6, 'Nike', 20, 50000.00, '2025-06-13', 1000000.00),
(7, 7, 'Stone Island', 3, 2500000.00, '2025-06-14', 7500000.00),
(9, 9, 'Geof Max', 15, 110000.00, '2025-06-15', 1650000.00),
(10, 10, 'Jam Tangan', 8, 80000.00, '2025-06-17', 640000.00),
(11, 19, 'Uniqlo', 6, 499000.00, '2025-06-20', 2994000.00),
(17, 26, 'Tas', 10, 199000.00, '2025-06-20', 1990000.00),
(18, 1, 'Tas', 5, 50000.00, '2025-06-28', 250000.00),
(19, 26, 'Tas', 20, 5000000.00, '2025-06-05', 100000000.00),
(20, 41, 'Baju', 12, 100000.00, '2025-06-19', 1200000.00),
(21, 43, 'Baju', 25, 100000.00, '2025-06-21', 2500000.00),
(22, 27, 'Dompet', 15, 50000.00, '2025-06-27', 750000.00),
(23, 45, 'Sendal', 25, 150000.00, '2025-06-28', 3750000.00),
(24, 31, 'Stone Island', 5, 3990000.00, '2025-06-25', 19950000.00),
(26, 27, 'Dompet', 12, 50000.00, '2025-06-28', 600000.00),
(29, 56, 'jaket', 15, 200000.00, '2025-07-02', 3000000.00);

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id_user`, `username`, `password`) VALUES
(1, 'admin', '240be518fabd2724ddb6f04eeb1da5967448d7e831c08c8fa822809f74c720a9'),
(8, 'punyagw', 'b8dda4f9646af7648f1eba8430002cc453d1f1ec816b6e39e76b45577573aadc'),
(13, 'dil', '3c1b49c435ce52d272ffdaa258b6e8c39e4def478223b90ba22580ccf65c0adb'),
(14, 'steven abraham', '97c45ed03fee03606ada6c055ab3ba029dfc41d1a2a666afb93dc6e0e3ac4624'),
(15, 'izul', '356a6511a0fc885f2a2c4e39d281ae22919fed264561765e999afc13732bc6b3'),
(16, 'regil', '3da7b6412e3797c28f7c46d888a02160264d443818d7587f38b8b03acc08dc5d'),
(17, 'fadel', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`kode_barang`);

--
-- Indeks untuk tabel `barang_keluar`
--
ALTER TABLE `barang_keluar`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `barang_masuk`
--
ALTER TABLE `barang_masuk`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `distributor`
--
ALTER TABLE `distributor`
  ADD PRIMARY KEY (`id_distributor`),
  ADD UNIQUE KEY `kode_barang` (`kode_barang`);

--
-- Indeks untuk tabel `jenis_barang`
--
ALTER TABLE `jenis_barang`
  ADD PRIMARY KEY (`kode_barang`) USING BTREE;

--
-- Indeks untuk tabel `pemesanan_barang`
--
ALTER TABLE `pemesanan_barang`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `barang`
--
ALTER TABLE `barang`
  MODIFY `kode_barang` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=57;

--
-- AUTO_INCREMENT untuk tabel `barang_keluar`
--
ALTER TABLE `barang_keluar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;

--
-- AUTO_INCREMENT untuk tabel `barang_masuk`
--
ALTER TABLE `barang_masuk`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=63;

--
-- AUTO_INCREMENT untuk tabel `distributor`
--
ALTER TABLE `distributor`
  MODIFY `id_distributor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=96;

--
-- AUTO_INCREMENT untuk tabel `jenis_barang`
--
ALTER TABLE `jenis_barang`
  MODIFY `kode_barang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=57;

--
-- AUTO_INCREMENT untuk tabel `pemesanan_barang`
--
ALTER TABLE `pemesanan_barang`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT untuk tabel `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
