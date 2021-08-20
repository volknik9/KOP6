/*
 *
 * This file is part of Kopycat emulator software.
 *
 * Copyright (C) 2020 INFORION, LLC
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * Non-free licenses may also be purchased from INFORION, LLC, 
 * for users who do not want their programs protected by the GPL. 
 * Contact us for details kopycat@inforion.ru
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 *
 */
package ru.inforion.lab403.kopycat.veos.ports.cstdlib

 
val errlistEnternal = mutableMapOf(
        0 to "Success",
        1 to "Operation not permitted",
        2 to "No such file or directory",
        3 to "No such process",
        4 to "Interrupted system call",
        5 to "Input/output error",
        6 to "No such device or address",
        7 to "Argument list too long",
        8 to "Exec format error",
        9 to "Bad file descriptor",
        10 to "No child processes",
        35 to "Resource deadlock avoided",
        12 to "Cannot allocate memory",
        13 to "Permission denied",
        14 to "Bad address",
        15 to "Block device required",
        16 to "Device or resource busy",
        17 to "File exists",
        18 to "Invalid cross-device link",
        19 to "No such device",
        20 to "Not a directory",
        21 to "Is a directory",
        22 to "Invalid argument",
        24 to "Too many open files",
        23 to "Too many open files in system",
        25 to "Inappropriate ioctl for device",
        26 to "Text file busy",
        27 to "File too large",
        28 to "No space left on device",
        29 to "Illegal seek",
        30 to "Read-only file system",
        31 to "Too many links",
        32 to "Broken pipe",
        33 to "Numerical argument out of domain",
        34 to "Numerical result out of range",
        11 to "Resource temporarily unavailable",
        115 to "Operation now in progress",
        114 to "Operation already in progress",
        88 to "Socket operation on non-socket",
        90 to "Message too long",
        91 to "Protocol wrong type for socket",
        92 to "Protocol not available",
        93 to "Protocol not supported",
        94 to "Socket type not supported",
        95 to "Operation not supported",
        96 to "Protocol family not supported",
        97 to "Address family not supported by protocol",
        98 to "Address already in use",
        99 to "Cannot assign requested address",
        100 to "Network is down",
        101 to "Network is unreachable",
        102 to "Network dropped connection on reset",
        103 to "Software caused connection abort",
        104 to "Connection reset by peer",
        105 to "No buffer space available",
        106 to "Transport endpoint is already connected",
        107 to "Transport endpoint is not connected",
        89 to "Destination address required",
        108 to "Cannot send after transport endpoint shutdown",
        109 to "Too many references: cannot splice",
        110 to "Connection timed out",
        111 to "Connection refused",
        40 to "Too many levels of symbolic links",
        36 to "File name too long",
        112 to "Host is down",
        113 to "No route to host",
        39 to "Directory not empty",
        87 to "Too many users",
        122 to "Disk quota exceeded",
        116 to "Stale file handle",
        66 to "Object is remote",
        37 to "No locks available",
        38 to "Function not implemented",
        84 to "Invalid or incomplete multibyte or wide character",
        74 to "Bad message",
        43 to "Identifier removed",
        72 to "Multihop attempted",
        61 to "No data available",
        67 to "Link has been severed",
        42 to "No message of desired type",
        63 to "Out of streams resources",
        60 to "Device not a stream",
        75 to "Value too large for defined data type",
        71 to "Protocol error",
        62 to "Timer expired",
        125 to "Operation canceled",
        130 to "Owner died",
        131 to "State not recoverable",
        85 to "Interrupted system call should be restarted",
        44 to "Channel number out of range",
        45 to "Level 2 not synchronized",
        46 to "Level 3 halted",
        47 to "Level 3 reset",
        48 to "Link number out of range",
        49 to "Protocol driver not attached",
        50 to "No CSI structure available",
        51 to "Level 2 halted",
        52 to "Invalid exchange",
        53 to "Invalid request descriptor",
        54 to "Exchange full",
        55 to "No anode",
        56 to "Invalid request code",
        57 to "Invalid slot",
        59 to "Bad font file format",
        64 to "Machine is not on the network",
        65 to "Package not installed",
        68 to "Advertise error",
        69 to "Srmount error",
        70 to "Communication error on send",
        73 to "RFS specific error",
        76 to "Name not unique on network",
        77 to "File descriptor in bad state",
        78 to "Remote address changed",
        79 to "Can not access a needed shared library",
        80 to "Accessing a corrupted shared library",
        81 to ".lib section in a.out corrupted",
        82 to "Attempting to link in too many shared libraries",
        83 to "Cannot exec a shared library directly",
        86 to "Streams pipe error",
        117 to "Structure needs cleaning",
        118 to "Not a XENIX named type file",
        119 to "No XENIX semaphores available",
        120 to "Is a named type file",
        121 to "Remote I/O error",
        123 to "No medium found",
        124 to "Wrong medium type",
        126 to "Required key not available",
        127 to "Key has expired",
        128 to "Key has been revoked",
        129 to "Key was rejected by service",
        132 to "Operation not possible due to RF-kill",
        133 to "Memory page has hardware error"
)