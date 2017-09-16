// **********************************************************************
//
// Copyright (c) 2003-2017 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.7.0
//
// <auto-generated>
//
// Generated from file `onlinebook.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.samsung.isp.service.onlinebook.generated;

public final class AuthorListHelper
{
    public static void write(com.zeroc.Ice.OutputStream ostr, java.util.List<com.samsung.isp.service.onlinebook.entity.Person> v)
    {
        if(v == null)
        {
            ostr.writeSize(0);
        }
        else
        {
            ostr.writeSize(v.size());
            for(com.samsung.isp.service.onlinebook.entity.Person elem : v)
            {
                ostr.writeSerializable(elem);
            }
        }
    }

    public static java.util.List<com.samsung.isp.service.onlinebook.entity.Person> read(com.zeroc.Ice.InputStream istr)
    {
        final java.util.List<com.samsung.isp.service.onlinebook.entity.Person> v;
        v = new java.util.List<Person>();
        final int len0 = istr.readAndCheckSeqSize(1);
        for(int i0 = 0; i0 < len0; i0++)
        {
            com.samsung.isp.service.onlinebook.entity.Person elem;
            elem = istr.readSerializable(com.samsung.isp.service.onlinebook.entity.Person.class);
            v.add(elem);
        }
        return v;
    }

    public static void write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<java.util.List<com.samsung.isp.service.onlinebook.entity.Person>> v)
    {
        if(v != null && v.isPresent())
        {
            write(ostr, tag, v.get());
        }
    }

    public static void write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.List<com.samsung.isp.service.onlinebook.entity.Person> v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            AuthorListHelper.write(ostr, v);
            ostr.endSize(pos);
        }
    }

    public static java.util.Optional<java.util.List<com.samsung.isp.service.onlinebook.entity.Person>> read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            java.util.List<com.samsung.isp.service.onlinebook.entity.Person> v;
            v = AuthorListHelper.read(istr);
            return java.util.Optional.of(v);
        }
        else
        {
            return java.util.Optional.empty();
        }
    }
}
