PGDMP     :    7                {            ems_angular_db    12.11    12.11 	               0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    32960    ems_angular_db    DATABASE     �   CREATE DATABASE ems_angular_db WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'English_United States.1252' LC_CTYPE = 'English_United States.1252';
    DROP DATABASE ems_angular_db;
                postgres    false            �            1259    33044    teacher    TABLE     �   CREATE TABLE public.teacher (
    id integer NOT NULL,
    address character varying(255),
    teacher_name character varying(255)
);
    DROP TABLE public.teacher;
       public         heap    postgres    false            �            1259    33042    teacher_sequence    SEQUENCE     y   CREATE SEQUENCE public.teacher_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE public.teacher_sequence;
       public          postgres    false                      0    33044    teacher 
   TABLE DATA           <   COPY public.teacher (id, address, teacher_name) FROM stdin;
    public          postgres    false    203   �                  0    0    teacher_sequence    SEQUENCE SET     >   SELECT pg_catalog.setval('public.teacher_sequence', 3, true);
          public          postgres    false    202            �
           2606    33051    teacher teacher_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.teacher
    ADD CONSTRAINT teacher_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.teacher DROP CONSTRAINT teacher_pkey;
       public            postgres    false    203                  x�3��K�I�LJL)�K����� 7��     